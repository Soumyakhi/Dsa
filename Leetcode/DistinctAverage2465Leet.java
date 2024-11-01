import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DistinctAverage2465Leet {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> hs=new HashSet<>();
        int start=0,end=nums.length-1;
        while(start<end){
            hs.add((double)(nums[start]+nums[end])/2);
            start++;
            end--;
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int nums[]={7,8,3,4,15,13,4,1};
        System.out.println((new DistinctAverage2465Leet()).distinctAverages(nums));
    }
}
