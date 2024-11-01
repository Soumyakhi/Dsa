import java.util.HashMap;

public class Fibonacci509Leet {
    /*public int fib(int n) {
        return memorize(n, new HashMap<>());
    }*/
    int memorize(int n,HashMap<Integer,Integer> hm) {
        if(n<=1){
            return n;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int res=memorize(n-1,hm)+memorize(n-2,hm);
        hm.put(n, res);
        return res;
    }
    public int fib(int n) {
        if(n<2){
            return n;
        }
        int arr[]={0,1};
        int i=2;
        while(i<=n){
            int temp=arr[1];
            arr[1]=arr[0]+arr[1];
            arr[0]=temp;
            i++;
        }
        return arr[1];
    }
    public static void main(String[] args) {
        System.out.println((new Fibonacci509Leet()).fib(5));
    }
}
