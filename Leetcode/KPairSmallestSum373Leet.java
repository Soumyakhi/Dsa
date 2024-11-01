import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
/*PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>((a,b)->{
            return (a.get(0)+a.get(1))-(b.get(0)+b.get(1));
        });
        for (int i : nums1) {
            for (int j : nums2) {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(i);
                al.add(j);
                pq.offer(al);
            }
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        while (k!=0) {
            k--;
            res.add(pq.poll());
        }
        return res;*/
public class KPairSmallestSum373Leet {
    public ArrayList<ArrayList<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        Set<String> vis = new HashSet<>();
        pq.offer(new int[]{nums1[0] + nums2[0], 0, 0});
        vis.add(0 + "," + 0);
        while (!pq.isEmpty() && k > 0) {
            int[] n = pq.poll();
            ArrayList<Integer> al = new ArrayList<>();
            al.add(nums1[n[1]]);
            al.add(nums2[n[2]]);
            res.add(al);
            k--;
            if(n[1]+1<nums1.length && !vis.contains((n[1]+1)+","+n[2])) {
                pq.offer(new int[]{(nums1[n[1]+1]+nums2[n[2]]),n[1]+1,n[2]});
                vis.add((n[1] + 1) + "," + n[2]);
            }
            if(n[2]+1<nums2.length && !vis.contains(n[1]+""+(n[2]+1))) {
                pq.offer(new int[]{(nums1[n[1]]+nums2[n[2]+1]),n[1],n[2]+1});
                vis.add(n[1] + "," + (n[2] + 1));
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] nums1={1,7,11};
        int[] nums2={2,4,6};
        ArrayList<ArrayList<Integer>>al=(new KPairSmallestSum373Leet()).kSmallestPairs(nums1, nums2, 3);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
