import java.util.HashMap;

public class DecodeWays91Leet {
    HashMap<Integer,Integer> hm=new HashMap<>();
    public int numDecodings(String s) {
        return helper(s, 0);
    }
    int helper(String s, int index) {
        if (index >= s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        if(hm.containsKey(index)){
            return hm.get(index);
        }
        int res = helper(s, index + 1);
        if (index + 1 < s.length()) {
            int number = Character.getNumericValue(s.charAt(index)) * 10 + Character.getNumericValue(s.charAt(index + 1));
            if (number <= 26) {
                res += helper(s, index + 2);
            }
        }
        hm.put(index, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new DecodeWays91Leet()).numDecodings("12"));
    }
}
