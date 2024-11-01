import java.util.Collections;
import java.util.PriorityQueue;

public class LastStone1046Leet {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            pq.add(num);
        }
        while (pq.size()>1 ) {
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={2,7,4,1,8,1};
        System.out.println((new LastStone1046Leet()).lastStoneWeight(arr));
    }
}
