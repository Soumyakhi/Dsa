public class SeparateDigits2553Leet {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        int []arr=new int[sb.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=Character.getNumericValue(sb.charAt(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        int []nums={13,25,83,77};
        int []res=(new SeparateDigits2553Leet()).separateDigits(nums);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
