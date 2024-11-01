import java.util.HashMap;

public class MinOperationXYEqLeet {
    public int minimumOperationsToMakeEqual(int x, int y) {
        return memo(x, y,new HashMap<>());
    }
    int memo(int x,int y,HashMap<Integer,Integer> hm){
        if(x==Integer.MIN_VALUE || x==Integer.MAX_VALUE){
            return Integer.MAX_VALUE-1;
        }
        if (x <= y) {
            return y - x;
        }
        if(hm.containsKey(x)){
            return hm.get(x);
        }
        int res = x - y;
        res = Math.min(res, 1 + memo(x - 1, y,hm));

        // Case 2: Divide x by 5 and add remainder
        // (optimized for 5)
        res = Math.min(res, 1 + x % 5 + memo(x / 5, y,hm));

        // Case 3: Divide x by 5 and add remaining value to
        // reach a multiple of 5 before subtracting 1
        // (optimized for 5)
        res = Math.min(res, 1 + (5 - x % 5)
                                + memo(x / 5 + 1, y,hm));

        // Case 4: Divide x by 11 and add remainder
        // (optimized for 11)
        res = Math.min(res, 1 + x % 11 + memo(x / 11, y,hm));

        // Case 5: Divide x by 11 and add remaining value to
        // reach a multiple of 11 before subtracting 1
        // (optimized for 11)
        res = Math.min(res, 1 + (11 - x % 11)
                                + memo(x / 11 + 1, y,hm));
        hm.put(x,res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new MinOperationXYEqLeet()).minimumOperationsToMakeEqual(26, 1));
    }
}
