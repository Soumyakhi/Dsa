import java.util.Arrays;

public class DivideArray2966Leet {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int rows=nums.length/3;
        int arr[][]=new int[rows][3];
        int row=0,col=0;
        for(int i=0;i<=nums.length-3;i+=3){
            if(nums[i+2]-nums[i+1]<=k && nums[i+2]-nums[i]<=k && 
            nums[i+1]-nums[i]<=k){
                arr[row][col++]=nums[i];
                arr[row][col++]=nums[i+1];
                arr[row][col++]=nums[i+2];
                row++;
                col=0;
            }
            else{
                return new int[0][0]; 
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,2,2,5,2};
        int arr1[][]=(new DivideArray2966Leet()).divideArray(arr, 2);
        for (int i[] : arr1) {
             System.out.println(Arrays.toString(i));
        }
       
    }
}
