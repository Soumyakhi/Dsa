import java.util.PriorityQueue;

public class KWeakestRows1337Leet {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        for(int i=0;i<mat.length;i++){
            int sum=sumOfRow(mat[i]);
            pq.offer(new int[]{sum,i});
        }
        int res[]=new int[k];
        int index=0;
        while (k!=0) {
            k--;
            res[index++]=pq.poll()[1];
        }
        return res;
    }
    int sumOfRow(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]arr={{1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
        int res[]=(new KWeakestRows1337Leet()).kWeakestRows(arr, 3);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
