import java.util.ArrayList;
import java.util.HashMap;

public class WaysToExpressIntegerAsSumOfPowers2787Leet {
    final int MOD = 1_000_000_007;
    private int[][] dp;
    public int numberOfWays(int n, int x) {
        ArrayList<Long>al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            long element = (long) Math.pow(i, x);
            if(element>n){
                break;
            }
            al.add(element);
        }
        dp = new int[al.size() + 1][n + 1];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        return helper(0, al,(long) n);
    }
    int helper(int index,ArrayList<Long>al,long target){
        if(target==0){
            return 1;
        }
        if(index>=al.size() || target<0){
            return 0;
        }
        String key=index+","+target;
        if (dp[index][(int) target] != -1) {
            return dp[index][(int) target];
        }
        //include
        int inc=helper(index+1, al, target-al.get(index));
        //exclude
        int exc=helper(index+1, al, target);
        int res=(inc+exc)%MOD;
        dp[index][(int) target] =res;
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new WaysToExpressIntegerAsSumOfPowers2787Leet()).numberOfWays(300, 5));
    }
}
