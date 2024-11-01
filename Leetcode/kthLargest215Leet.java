import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargest215Leet {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<nums.length;i++) {
            pq.offer(nums[i]);
        }
        k=k-1;
        while (k!=0) {
            k--;
            pq.poll();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int []arr={3,2,3,1,2,4,5,5,6};
        System.out.println((new kthLargest215Leet()).findKthLargest(arr, 4));
    }
}
