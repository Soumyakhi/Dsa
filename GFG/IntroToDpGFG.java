import java.util.HashMap;

public class IntroToDpGFG {
    private static final int MOD = 1_000_000_007;
    static long topDown(int n) {
        
        return helper(n, new HashMap<>());
    }
    static long helper(int n,HashMap<Integer,Long> hm) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        long res=(helper(n-1, hm)+helper(n-2, hm))%MOD;
        hm.put(n, res);
        return res;
    }

    static long bottomUp(int n) {
        if (n <= 1) return n;
        long a=0,b=1,c=0;
        for (int i = 2; i <= n; ++i) {
            c =( a+b )%MOD;
            a=b;
            b=c;
        }
        return c;
    }
}
