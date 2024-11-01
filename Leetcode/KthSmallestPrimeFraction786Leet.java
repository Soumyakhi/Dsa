import java.util.PriorityQueue;

public class KthSmallestPrimeFraction786Leet {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Float[]>pq=new PriorityQueue<>((a,b)->{
                return Float.compare((a[0]/a[1]), (b[0]/b[1]));
        });
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                pq.offer(new Float[]{(float) arr[i],(float) arr[j]});
            }
        }
        while (k!=1) {
            k--;
            pq.poll();
        }
        return new int[]{(int) Math.abs(pq.peek()[0]),(int) Math.abs(pq.peek()[1])};
    }
    public static void main(String[] args) {
        int arr[]={1,29,47};
        arr=(new KthSmallestPrimeFraction786Leet()).kthSmallestPrimeFraction(arr, 1);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
