import java.util.Scanner;

public class MiddleIndex1991Leet {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int lsum=0,rsum=0;
        for(int i=1;i<nums.length;i++){
            rsum+=nums[i];
        }
        if(rsum==lsum){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            rsum-=nums[i];
            if(rsum==lsum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-1,8,4};
        System.err.println((new MiddleIndex1991Leet()).findMiddleIndex(arr));
    }
}
