public class RangeSum303Leet {
    int []nums;
    public RangeSum303Leet(int[] nums) {
        this.nums=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=this.nums[i];
        }
        return sum;
    }
}
