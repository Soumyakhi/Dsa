import java.util.*;

public class LongestRepeat424Leet {
    public int characterReplacement(String s, int k) {
        int maxVal=0;
        for (int j = 0; j < 26; j++) {
            char ch = (char) (j + 'A');
            int left = 0;
            int count = 0;
            int maxLength = 0;
            for (int right = 0; right < s.length(); right++) {
                if (s.charAt(right) != ch) {
                    count++;
                }
                if (count > k) {
                    if (s.charAt(left)!= ch) {
                        count--;
                    }
                    left++;
                }
                maxLength = Math.max(maxLength, right - left + 1);
            }
            maxVal=Math.max(maxLength,maxVal);
        }
        return maxVal;
    }
    public static void main(String[] args) {
        System.out.println((new LongestRepeat424Leet()).characterReplacement("ABAB", 2));
    }
}
