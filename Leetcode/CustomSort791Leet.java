import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CustomSort791Leet {
    public String customSortString(String order, String s) {
        Map<Character, Integer> priorityMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            priorityMap.put(order.charAt(i), i);
        }
        Character[] sChars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sChars[i] = s.charAt(i);
        }
        Arrays.sort(sChars, (a, b) -> {
            int priorityA = priorityMap.getOrDefault(a, Integer.MAX_VALUE);
            int priorityB = priorityMap.getOrDefault(b, Integer.MAX_VALUE);
            return Integer.compare(priorityA, priorityB);
        });
        StringBuilder result = new StringBuilder();
        for (char c : sChars) {
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println((new CustomSort791Leet()).customSortString("kqep", "pekeq"));
    }
}
