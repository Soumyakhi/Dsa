import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayParity905Leet {
    /*public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        int index=0;
        for (Integer integer : even) {
            nums[index++]=integer;
        }
        for (Integer integer : odd) {
            nums[index++]=integer;
        }
        return nums;
    }*/
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int l=0,r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[l++]=nums[i];
            }
            else{
                arr[r--]=nums[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={3,1,2,4};
        System.out.println(Arrays.toString((new SortArrayParity905Leet()).sortArrayByParity(arr)));
    }
}
