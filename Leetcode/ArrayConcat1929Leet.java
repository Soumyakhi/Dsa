public class ArrayConcat1929Leet {
    public int[] getConcatenation(int[] nums) {
        int index=0,inl=nums.length;
        int []a=new int[nums.length*2];
        for (int i : nums) {
            a[index++]=i;
            a[inl++]=i;
        }
        return a;
    }
    public static void main(String[] args) {
        int []a={1,2,1};
        ArrayConcat1929Leet ac=new ArrayConcat1929Leet();
        int arr[]=ac.getConcatenation(a);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
