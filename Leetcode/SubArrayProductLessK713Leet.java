public class SubArrayProductLessK713Leet {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0,count=0;
        while (l<nums.length && nums[l]>=k) {
            l++;
            r++;
        }
        if(l==nums.length){
            return 0;
        }
        int product=1;
        while (r<nums.length) {
            if(nums[r]>=k){
                product=1;
                l=r+1;
            }
            else{
                if(product*nums[r]<k){
                    product=product*nums[r];
                    count += (r - l + 1);
                }
                else{
                    while (product*nums[r]>=k && l<=r) {
                        product/=nums[l];
                        l++;
                    }
                    product*=nums[r];
                    count += (r - l + 1);
                }
            }
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr={10,5,2,6};
        System.out.println((new SubArrayProductLessK713Leet()).numSubarrayProductLessThanK(arr, 100));
    }
}
