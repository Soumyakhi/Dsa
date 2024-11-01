public class GoodPairsI3162Leet {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for (int i : nums1) {
            for (int j : nums2) {
                if(i%(j*k)==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,4,12};
        int[] nums2={2,4};
        System.out.println((new GoodPairsI3162Leet()).numberOfPairs(nums1, nums2, 3));
    }
}
