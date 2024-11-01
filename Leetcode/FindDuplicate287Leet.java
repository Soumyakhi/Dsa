public class FindDuplicate287Leet {
    public int findDuplicate(int[] nums) {
        int fast=0,slow=0;
        while (true) {
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(fast==slow){
                break;
            }
        }
        slow=0;
        while (slow!=fast) {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int []num={1,3,4,3,2};
        System.out.println((new FindDuplicate287Leet()).findDuplicate(num));
    }
}
