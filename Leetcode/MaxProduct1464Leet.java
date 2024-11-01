import java.util.Arrays;

public class MaxProduct1464Leet {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,index=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max1=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max2 && nums[i]!=index){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }       
    public static void main(String[] args) {                 
        int arrs[]={1,5,4,5};
        System.out.println((new MaxProduct1464Leet()).maxProduct(arrs));
    }
}
