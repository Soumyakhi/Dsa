public class MaxProductSubArray152Leet {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int res=nums[0];
        int min=1,max=1;
        for(int i=0;i<nums.length;i++){
            int currMin=Math.min(Math.min(min*nums[i],max*nums[i]),nums[i]);
            int currMax=Math.max(Math.max(min*nums[i],max*nums[i]),nums[i]);
            min=currMin;
            max=currMax;
            res=Math.max(max, res);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new MaxProductSubArray152Leet()).maxProduct(
            new int[]{0,2,3,-1,4,-2}
        ));
    }
}
