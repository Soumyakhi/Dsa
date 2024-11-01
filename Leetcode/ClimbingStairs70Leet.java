import java.util.HashMap;

public class ClimbingStairs70Leet {
    public int climbStairs(int n) {
        return memorize(n,new HashMap<>());
    }
    int memorize(int n,HashMap<Integer,Integer> hm) {
        if(n<3){
            return n;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int res=memorize(n-1,hm)+memorize(n-2,hm);
        hm.put(n, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new ClimbingStairs70Leet()).climbStairs(3));
    }
}
