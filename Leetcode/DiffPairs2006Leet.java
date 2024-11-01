public class DiffPairs2006Leet {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,1};
        System.out.println((new DiffPairs2006Leet()).countKDifference(nums, 1));
    }
}
