public class FindMin153Leet {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while (l<r) {
            int mid=(l+r)/2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        System.out.println((new FindMin153Leet()).findMin(a));
    }
}
