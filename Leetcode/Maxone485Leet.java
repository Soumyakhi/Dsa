public class Maxone485Leet {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                streak++;
                max=Math.max(max, streak);
            }
            else{
                streak=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println((new Maxone485Leet()).findMaxConsecutiveOnes(arr));
    }
}
