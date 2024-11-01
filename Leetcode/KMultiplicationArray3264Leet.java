import java.util.PriorityQueue;

public class KMultiplicationArray3264Leet {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
        }
        while (k!=0) {
            k--;
            int arr[]=pq.poll();
            arr[0]=arr[0]*multiplier;
            pq.add(arr);
        }
        while (!pq.isEmpty()) {
            int arr[]=pq.poll();
            nums[arr[1]]=arr[0];
        }
        return nums;
    }
    public static void main(String[] args) {
        int []n={2,1,3,5,6};
        n=(new KMultiplicationArray3264Leet()).getFinalState(n, 5, 2);
        for (int i : n) {
            System.out.print(i+" ");
        }
    }
}
