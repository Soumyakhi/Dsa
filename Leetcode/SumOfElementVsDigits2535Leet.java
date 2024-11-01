public class SumOfElementVsDigits2535Leet {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            int num=nums[i],r;
            while (num!=0) {
                r=num%10;
                sum2+=r;
                num/=10;
            }
        }
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args) {
        int nums[]={1,15,6,3};
        System.out.println((new SumOfElementVsDigits2535Leet()).differenceOfSum(nums));
    }
}
