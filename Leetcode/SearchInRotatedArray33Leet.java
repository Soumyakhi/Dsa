public class SearchInRotatedArray33Leet {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
            int mid=(l+r)/2;
            if(target==nums[mid]){
                return mid;
            }
            //left sorted
            if(nums[l]<=nums[mid]){
                if(target>nums[mid]){
                    l=mid+1;
                }
                else{
                    if(target<nums[l]){
                        l=mid+1;
                    }
                    else{
                        r=mid-1;
                    }
                }
            }
            //right sorted
            else{
                if(target<nums[mid]){
                    r=mid-1;
                }
                else{
                    if(target>nums[r]){
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println((new SearchInRotatedArray33Leet()).search(num, 0));
    }
}
