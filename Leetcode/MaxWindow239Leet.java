import java.util.*;

public class MaxWindow239Leet {
    class Pair {
        int val, idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        int n = nums.length;
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pq.offer(new Pair(nums[i], i));
            while (pq.peek().idx <= i - k) {
                pq.poll();
            }
            if (i >= k - 1) {
                result.add(pq.peek().val);
            }
        }
        int res[]=new int[result.size()];
        int index=0;
        for (Integer integer : result) {
            res[index++]=integer;
        }
        return res;
        //return  result.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        MaxWindow239Leet maxWindow239Leet = new MaxWindow239Leet();
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        for (int i : maxWindow239Leet.maxSlidingWindow(arr, 3)) {
            System.out.println(i);
        }
    }
}
