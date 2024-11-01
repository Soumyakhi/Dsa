import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KClosestPoints973Leet {
    public int[][] kClosest(int[][] points, int k) {
        int [][] res=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return Double.compare((Math.pow(0-a[0],2)+Math.pow(0-a[1],2)),(Math.pow(0-b[0],2)+Math.pow(0-b[1],2)));
        });
        for (int[] is : points) {
            pq.offer(is);
        }
        int index=0;
        while(k!=0){
            k--;
            int []a=pq.poll();
            res[index][0]=a[0];
            res[index][1]=a[1];
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int [][]arr={{1,3},{-2,2}};
        arr=((new KClosestPoints973Leet()).kClosest(arr, 1));
        for (int[] is : arr) {
            System.out.println(is[0]+" "+is[1]);
        }

    }
}
