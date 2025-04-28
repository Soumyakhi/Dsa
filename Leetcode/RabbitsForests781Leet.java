import java.util.HashMap;
import java.util.Map;

public class RabbitsForests781Leet {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int ans : answers) {
            freq.put(ans, freq.getOrDefault(ans, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int x = entry.getKey();
            int rabbitsCalled=entry.getValue();
            int groups=rabbitsCalled/(x+1);
            int groupsRem=rabbitsCalled%(x+1);
            sum+=(x+1)*groups;
            if (groupsRem > 0) {
                sum += x+1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        System.out.println((new RabbitsForests781Leet()).numRabbits(arr));
    }
}
