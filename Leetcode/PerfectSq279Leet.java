import java.util.HashMap;

public class PerfectSq279Leet {
    HashMap<Integer,Integer> hm=new HashMap<>();
    public int numSquares(int n) {
        if(n==0){
            return 0;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            min=Math.min(min, numSquares(n-(i*i)));
        }
        min++;
        hm.put(n, min);
        return min;
    }
    public static void main(String[] args) {
        System.out.println((new PerfectSq279Leet()).numSquares(12));
    }
}
