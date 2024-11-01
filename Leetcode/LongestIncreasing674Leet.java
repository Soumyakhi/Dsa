public class LongestIncreasing674Leet {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,max=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                max=Math.max(max, count);
                count=1;
            }
        }
        max=Math.max(max, count);
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,3,5,7};
        System.out.println((new LongestIncreasing674Leet()).findLengthOfLCIS(arr));
    }
}
