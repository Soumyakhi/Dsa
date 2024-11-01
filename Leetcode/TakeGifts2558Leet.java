import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGifts2558Leet {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pk=new PriorityQueue<>(Collections.reverseOrder());
        for (Integer integer : gifts) {
            pk.offer(integer);
        }
        while (k!=0) {
            int x=pk.poll();
            pk.offer((int)(Math.sqrt(x)));
            k--;
        }
        long sum=0;
        while (!pk.isEmpty()) {
            sum+=pk.poll();
        }
        return sum;
    }
    public static void main(String[] args) {
        int n[]={25,64,9,4,100};
        System.out.println((new TakeGifts2558Leet()).pickGifts(n, 4));
    }
}
