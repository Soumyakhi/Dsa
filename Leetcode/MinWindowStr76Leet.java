import java.util.*;

public class MinWindowStr76Leet {
    public String minWindow(String s, String t) {
        int left = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> resMap = new HashMap<>();
        for (char character : t.toCharArray()) {
            tMap.put(character, tMap.getOrDefault(character, 0) + 1);
        }
        int required = tMap.size();
        int formed = 0;
        int countArrMin = Integer.MAX_VALUE;
        String res = "";
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            resMap.put(c, resMap.getOrDefault(c, 0) + 1);
            if (tMap.containsKey(c) && resMap.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }
            while (formed == required && left <= right) {
                if (countArrMin > right - left + 1) {
                    res = s.substring(left, right + 1);
                }
                char leftChar = s.charAt(left);
                resMap.put(leftChar, resMap.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) && resMap.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println((new MinWindowStr76Leet()).minWindow("ADOBECODEBANC", "ABC"));
    }
}
