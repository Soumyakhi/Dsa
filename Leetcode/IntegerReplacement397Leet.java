import java.util.HashMap;

public class IntegerReplacement397Leet {
    public int integerReplacement(int n) {
        return replace(n,new HashMap<>());
    }
    int replace(int n,HashMap<Integer,Integer> hm){
        if(n==1){
            return 0;
        }
        int res;
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        if(n%2==0){
            res=1+replace(n/2,hm);
        }
        else{
            if(n==Integer.MAX_VALUE){
                res=33;
            }
            else{
                int plus=1+replace(n+1,hm);
                int minus=1+replace(n-1,hm);
                res=Math.min(plus, minus);
            }
        }
        hm.put(n, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new IntegerReplacement397Leet()).integerReplacement(8));
    }
}
