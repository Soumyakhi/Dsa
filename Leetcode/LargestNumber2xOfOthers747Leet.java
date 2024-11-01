public class LargestNumber2xOfOthers747Leet {
    public int dominantIndex(int[] nums) {
        int max=0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        boolean isGreater=true;
        for (int i=0;i<nums.length;i++) {
            if(i==max){
                continue;
            }
            if(nums[max]<nums[i]*2){
                isGreater=false;
                break;
            }
        }
        if(isGreater){
            return max;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums={3,6,1,0};
        System.out.println((new LargestNumber2xOfOthers747Leet()).dominantIndex(nums));
    }
}
