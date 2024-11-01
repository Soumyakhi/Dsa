public class MissingNumber268Leet {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<=nums.length;i++){
            sum1+=i;
        }
        for (int i : nums) {
            sum2+=i;
        }
        return sum1-sum2;
    }
    public static void main(String[] args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        System.out.println((new MissingNumber268Leet()).missingNumber(nums));
    }
}
