import java.util.PriorityQueue;

public class SubSeqKSums2099Leet {
    public int[] maxSubsequence(int[] nums, int k) {
        int res[]=new int[k];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
        }
        PriorityQueue<int[]> pq1=new PriorityQueue<>((a,b)->a[1]-b[1]);
        while (k!=0) {
            k--;
            pq1.offer(pq.poll());
        }
        int index=0;
        while(!pq1.isEmpty()){
            res[index++]=pq1.poll()[0];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,3};
        arr=(new SubSeqKSums2099Leet()).maxSubsequence(arr, 2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
