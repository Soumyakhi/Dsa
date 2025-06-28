public class SingleElement540Leet {
    public int singleNonDuplicate(int[] nums) {
        int len=nums.length;
        if(len==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[len-1]!=nums[len-2]){
            return nums[len-1];
        }
        int left=1,right=len-2;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] ){
                return nums[mid];
            }
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println((new SingleElement540Leet())
        .singleNonDuplicate(nums));
    }
}
