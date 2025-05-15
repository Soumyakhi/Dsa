public class TotalChar3335Leet {
    /*public int lengthAfterTransformations(String s, int t) {
        for(int i=0;i<t;i++){
            StringBuilder sb=new StringBuilder();
            for (char chr : s.toCharArray()) {
                if(chr=='z'){
                    sb.append("ab");
                }
                else{
                    sb.append((char)(chr+1));
 
                }
            }
            s=sb.toString();
        }
        System.out.println(s);
        return s.length();
    }*/
    private static final int MOD = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {
        int[][] dp = new int[t + 1][26];
        for (char ch : s.toCharArray()) {
            dp[0][ch - 'a']++;
        }
        for(int step=1;step<=t;step++){
            for(int ch=0;ch<26;ch++){
                int count = dp[step - 1][ch];
                if(count==0){
                    continue;
                }
                if (ch == 25) {
                    dp[step][0] = (dp[step][0]+count)%MOD;
                    dp[step][1] = (dp[step][1]+count)%MOD;
                } else {
                    dp[step][ch + 1] = (dp[step][ch + 1]+count)%MOD;
                }
            }
        }
        int lenSum=0;
        for (int vals : dp[t]) {
            lenSum = (lenSum + vals) % MOD;
        }
        return lenSum;
    }
    public static void main(String[] args) {
        System.out.println((new TotalChar3335Leet()).lengthAfterTransformations("abcyy", 2));
    }
}
