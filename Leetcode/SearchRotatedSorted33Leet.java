public class SearchRotatedSorted33Leet {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
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
        int [][]matrix={{4,7,11,15,0,2,3}};
        System.out.println((new Search2d74Leet()).searchMatrix(matrix, 7));
    }
}
