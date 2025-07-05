import java.util.HashMap;
import java.util.Map;

public class SubArrSumDivK974Leet {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int i : nums) {
            sum += i;
            int mod = sum % k;
            if (mod < 0) mod += k;
            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 0, -2, -3, 1 };
        System.out.println((new SubArrSumDivK974Leet()).subarraysDivByK(arr, 5));
    }
}
