import java.util.HashMap;
import java.util.PriorityQueue;
public class SortIntPower1387Leet {
    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer> cache=new HashMap<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=lo;i<=hi;i++){
            int val=getPower(i, cache);
            hm.put(i, val);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int res1=hm.get(a);
            int res2=hm.get(b);
            if(res1==res2){
                return a-b;
            }
            return res1-res2;
        });
        
        hm.forEach((key,val)->{
            pq.offer(key);
        });
        while (k>1) {
            k--;
            pq.poll();
        }
        return pq.peek();
    }
    int getPower(int n,HashMap<Integer,Integer> cache){
        if(n==1){
            return 0;
        }
        int res;
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        if(n%2==0){
            res=1+getPower(n/2,cache);
        }
        else{
            res=1+getPower((3*n)+1,cache);
        }
        cache.put(n, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new SortIntPower1387Leet()).getKth(12, 15, 2));
    }
}
