import java.util.*;

public class CommonWord19Leet {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> freq = new HashMap<>();
        Set<String> bSet = new HashSet<>();
        for (String string : banned) {
            bSet.add(string.toLowerCase());
        }

        // Replace all punctuations with space, convert to lowercase
        paragraph = paragraph.replaceAll("[!?',;\\.]", " ").toLowerCase();

        String wordsArr[] = paragraph.split("\\s+");

        for (String newStr : wordsArr) {
            if (newStr.isEmpty() || bSet.contains(newStr))
                continue;
            freq.put(newStr, freq.getOrDefault(newStr, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        String res = "";
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                (new CommonWord19Leet()).mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                        new String[] { "hit" }));
    }
}
