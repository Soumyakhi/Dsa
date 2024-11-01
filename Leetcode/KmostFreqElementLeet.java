import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KmostFreqElementLeet {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.offer(entry);
        }
        int res[]=new int[k];
        int index=0;
        while (k!=0) {
            k--;
            res[index++]=pq.poll().getKey();
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3};
        arr=(new KmostFreqElementLeet()).topKFrequent(arr, 2);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
