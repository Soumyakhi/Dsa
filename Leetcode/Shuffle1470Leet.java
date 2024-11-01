public class Shuffle1470Leet {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            arr1[index1++]=nums[i];
        }
        for(int i=n;i<nums.length;i++){
            arr2[index2++]=nums[i];
        }
        int index3=0;
        index1=0;
        index2=0;
        while(index3<nums.length){
            nums[index3++]=arr1[index1++];
            nums[index3++]=arr2[index2++];
        }
        return arr1;
    }
    public static void main(String[] args) {
        
    }
}
