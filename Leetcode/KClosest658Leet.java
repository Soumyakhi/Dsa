import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KClosest658Leet {
    public ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int val=Math.abs(a-x)-Math.abs(b-x);
            if(val==0){
                return a-b;
            }
            return val;    
        });
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        var al=new ArrayList<Integer>();
        for (Integer integer : pq) {
            System.out.println(integer);
        }
        while (k!=0) {
            k--;
            al.add(pq.poll());
        }
        Collections.sort(al);
        return al;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,2,3,3,4,7,7,8};
        System.out.println((new KClosest658Leet()).findClosestElements(arr, 3, 5));
    }
}
