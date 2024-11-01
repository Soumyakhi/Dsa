public class ProductOfArray238Leet {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int prefix=1,postfix=1;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=prefix;
            prefix*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=postfix;
            postfix*=nums[i];
        }
        return result;
    }
    /*public int[] productExceptSelf(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int p=1;
        for (int i : nums) {
            p=p*i;
        }
        int result[]=new int[nums.length];
        int index=0;
        for (int i : nums) {
            result[index++]=p/i;
        }
        return result;
    }*/
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        ProductOfArray238Leet pr=new ProductOfArray238Leet();
        int arr2[]=pr.productExceptSelf(arr);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
