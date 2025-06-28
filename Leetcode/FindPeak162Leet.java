public class FindPeak162Leet {
    public int findPeakElement(int[] nums) {
        int len=nums.length;
        if(len==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[len-1]>nums[len-2]){
            return len-1;
        }
        int left=1,right=len-2;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] ){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                    left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println((new FindPeak162Leet()).findPeakElement(new int[]{1,2,3,1}));
    }
}
