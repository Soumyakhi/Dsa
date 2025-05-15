import java.util.*;

public class NextPermutation51Leet {
    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                breakPoint = i - 1;
                break;
            }
        }
        if (breakPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        int replacementIndex = -1;
        for (int i = nums.length - 1; i > breakPoint; i--) {
            if (nums[i] > nums[breakPoint]) {
                replacementIndex = i;
                break;
            }
        }
        int temp = nums[breakPoint];
        nums[breakPoint] = nums[replacementIndex];
        nums[replacementIndex] = temp;
        int left = breakPoint + 1, right = nums.length - 1;
        while (left < right) {
            temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
    /*public void nextPermutation(int[] nums) {
        int breakPoint=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                breakPoint=i-1;
                break;
            }
        }
        if(breakPoint==-1){
            Arrays.sort(nums);
            return;
        }
        int replacement=Integer.MAX_VALUE,replacementIndex=-1;
        for(int i=breakPoint+1;i<nums.length;i++){
            if(nums[i]>nums[breakPoint]){
                replacement=Math.min(replacement, nums[i]);
                if(replacement==nums[i]){
                    replacementIndex=i;
                }
            }
        }
        nums[replacementIndex]=nums[breakPoint];
        nums[breakPoint]=replacement;
        PriorityQueue<Integer> toQueue=new PriorityQueue<>();
        for(int i=breakPoint+1;i<nums.length;i++){
            toQueue.offer(nums[i]);
        }
        for(int i=breakPoint+1;i<nums.length;i++){
            nums[i]=toQueue.poll();
        } 
    }*/

    public static void main(String[] args) {
        int[] nums = { 1, 1, 5 };
        new NextPermutation51Leet().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
