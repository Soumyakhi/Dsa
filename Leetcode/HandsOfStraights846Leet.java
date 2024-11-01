import java.util.HashMap;
import java.util.PriorityQueue;

public class HandsOfStraights846Leet {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer num : hand) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            if (!pq.contains(num)) {
                pq.offer(num);
            }
        }
        while (!pq.isEmpty()) {
            int first = pq.peek();
            for (int i = first; i < first + groupSize; i++) {
                if (!hm.containsKey(i) || hm.get(i) < 1) {
                    return false;
                }
                hm.put(i, hm.get(i) - 1);
                if (hm.get(i) == 0) {
                    if (pq.peek() == i) {
                        pq.poll();
                    }
                }
            }
        }
    
        return true;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,6,2,3,4,7,8};
        System.out.println((new HandsOfStraights846Leet()).isNStraightHand(arr, 3));
    }
}
