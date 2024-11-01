public class SqSorted977Leet {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        int f=0,l=nums.length-1;
        for(int i=res.length-1;i>-1;i--){
            if(nums[f]*nums[f]>=nums[l]*nums[l]){
                res[i]=nums[f]*nums[f];
                f++;
            }
            else{
                res[i]=nums[l]*nums[l];
                l--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={-7,-3,2,3,11};
        int []res=(new SqSorted977Leet()).sortedSquares(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
