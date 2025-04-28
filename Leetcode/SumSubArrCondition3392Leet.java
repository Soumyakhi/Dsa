public class SumSubArrCondition3392Leet {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]==nums[i+1]/2 && nums[i+1]%2==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println((new SumSubArrCondition3392Leet()).countSubarrays(new int[]{1,2,1,4,1}));
    }

}
