public class JumpGameII45Leet {
    public int jump(int[] nums) {
        int res=0;
        int l=0,r=0;
        while (r<nums.length-1) {
            int furthest=0;
            for(int i=l;i<=r;i++){
                furthest=Math.max(furthest, i+nums[i]);
            }
            l=r+1;
            r=furthest;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new JumpGameII45Leet()).jump(new int[]{2,3,1,1,4}));
    }
}
