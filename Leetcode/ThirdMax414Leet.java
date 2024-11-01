import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

public class ThirdMax414Leet {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        PriorityQueue<Integer> pk=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                pk.offer(nums[i]);
            }
        }
        if(hs.size()<3){
            return pk.peek();
        }
        int k=2;
        while (k!=0) {
            k--;
            pk.poll();
        }
        return pk.peek();
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,1};
        System.out.println((new ThirdMax414Leet()).thirdMax(arr));
    }
}
