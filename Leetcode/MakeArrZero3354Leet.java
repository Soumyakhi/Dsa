import java.util.Arrays;
public class MakeArrZero3354Leet {
    /*public int countValidSelections(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i]==0){
                if(simulate(Arrays.copyOf(nums,nums.length), 1, i)){
                    count++;
                }
                if(simulate(Arrays.copyOf(nums,nums.length), -1, i)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean simulate(int []arr,int direction,int index){
        int curr=index;
        while (curr<arr.length && curr>-1) {
            if(arr[curr]>0){
                arr[curr]-=1;
                direction*=-1;
            }
            curr+=direction;
        }
        return checkArr(arr);
    }
    boolean checkArr(int []nums){
        for (int i : nums) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }*/

        public int countValidSelections(int[] nums) {
            int count = 0;
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    if (simulate(nums, i, 1)) count++;
                    if (simulate(nums, i, -1)) count++;
                }
            }
    
            return count;
        }
    
        private boolean simulate(int[] nums, int start, int dir) {
            int[] seen = new int[nums.length];
            int curr = start;
            while (curr >= 0 && curr < nums.length) {
                if (nums[curr] > 0 && seen[curr] != nums[curr]) {
                    if (seen[curr] > nums[curr]) return false;
                    seen[curr]++;
                    dir *= -1;
                }
                curr += dir;
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != seen[i]) return false;
            }
    
            return true;
        }
    
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3};
        System.out.println((new MakeArrZero3354Leet()).countValidSelections(arr));
    }
}
