import java.util.HashMap;

public class TriboNacci1137Leet {
    public int tribonacci(int n) {
        return memorize(n, new HashMap<>());
    }
    int memorize(int n,HashMap<Integer,Integer> hm) {
        if(n==0){
            return 0;
        }
        if(n<3){
            return 1;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int res=memorize(n-1,hm)+memorize(n-2,hm)+memorize(n-3,hm);
        hm.put(n, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new TriboNacci1137Leet()).tribonacci(4));
    }
}
