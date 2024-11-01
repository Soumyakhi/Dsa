import java.util.HashMap;

public class LongestPallindromicSubSeq516Leet {
    public int longestPalindromeSubseq(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        return dfs(s, 0, s.length() - 1, hm);
    }

    private int dfs(String s, int i, int j, HashMap<String, Integer> hm) {
        if (i > j) {
            return 0;
        }
        if (i < 0 || j >= s.length()) {
            return 0;
        }
        String key = i + "," + j;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }

        int res;
        if (s.charAt(i) == s.charAt(j)) {
            if (i == j) {
                res = 1;
            } else {
                res = 2 + dfs(s, i + 1, j - 1, hm); 
            }
        } else {
            res = Math.max(dfs(s, i + 1, j, hm), dfs(s, i, j - 1, hm));
        }

        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new LongestPallindromicSubSeq516Leet())
        .longestPalindromeSubseq("bbbab"));
    }
}
