public class BinarySearch704Leet {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
            int mid=(r+l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []num={9};
        System.out.println((new BinarySearch704Leet()).search(num, 9));
    }
}
