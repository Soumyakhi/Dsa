public class CountSubArrFixedBounds2444Leet {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int minIndex=-1,maxIndex=-1,badPos=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                badPos=i;
            }
            if(nums[i]==minK){
                minIndex=i;
            }
            if(nums[i]==maxK){
                maxIndex=i;
            }
            int validStart=Math.min(minIndex,maxIndex);
            if(validStart>badPos){
                count+=validStart-badPos;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new CountSubArrFixedBounds2444Leet()).countSubarrays(new int[]{1,3,5,2,7,5},1,5));
    }
}
