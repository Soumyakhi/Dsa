public class JumpingGame55Leet {
    public boolean canJump(int[] nums) {
        int len=nums.length,target=len-1;
        for(int i=len-2;i>=0;i--){
            if(i+nums[i]>=target){
                target=i;
            }
        }
        return target==0;
    }
    public static void main(String[] args) {
        int []arr={2,3,1,1,4};
        System.out.println((new JumpingGame55Leet()).canJump(arr));
    }
}
