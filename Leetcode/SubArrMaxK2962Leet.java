import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SubArrMaxK2962Leet{
    /*public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for (int i : nums) {
            max=Math.max(i, max);
        }
        long arrCount=0;
        List<Integer> indexList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                indexList.add(i);
            }
            if(indexList.size()>=k){
                int kthLastIndex = indexList.get(indexList.size() - k);
                arrCount += (kthLastIndex + 1);
            }
        }
        return arrCount;
    }*/
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for (int i : nums) {
            max=Math.max(i, max);
        }
        long arrCount=0;
        Queue<Integer> indexQueue=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                indexQueue.add(i);
                if(indexQueue.size()>k){
                    indexQueue.poll();
                }
            }
            if(indexQueue.size()==k){
                arrCount+=indexQueue.peek()+1;
            }
        }
        return arrCount;
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,3,3};
        System.out.println((new SubArrMaxK2962Leet()).countSubarrays(nums, 2));
    }
}