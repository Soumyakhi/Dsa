public class SearchInsertPosition35Leet {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        if(nums[l]> target){
            return 0;
        }
        if(nums[r]< target){
            return r+1;
        }
        int mid=0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
                
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
              l = mid + 1;
            }  
        }
        return l;
    }
    public static void main(String[] args) {
        SearchInsertPosition35Leet sr=new SearchInsertPosition35Leet();
        int []a={1,2,5,6};
        System.out.println(sr.searchInsert(a, 3));
    }
    
}
