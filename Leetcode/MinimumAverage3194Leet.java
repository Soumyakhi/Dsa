import java.util.Arrays;
public class MinimumAverage3194Leet {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
        double min=Integer.MAX_VALUE;
        while(start<end){
            min=Math.min(((double)(nums[start]+nums[end])/2),min);
            start++;
            end--;
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[]={7,8,3,4,15,13,4,1};
        System.out.println((new MinimumAverage3194Leet()).minimumAverage(nums));
    }
}
