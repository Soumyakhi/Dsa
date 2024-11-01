public class FindPivotIndex724Leet {
    public int pivotIndex(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int suml=0,sumr=0;
        for(int i=0;i<nums.length;i++){
            suml+=nums[i];
            left[i]=suml;
        }
        for(int i=nums.length-1;i>-1;i--){
            sumr+=nums[i];
            right[i]=sumr;
        }
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        System.out.println(
            (new FindPivotIndex724Leet())
            .pivotIndex(nums));
    }
}
