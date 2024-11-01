class SingleNumber136Leet{
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum^nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SingleNumber136Leet sn=new SingleNumber136Leet();
        int []arr={4,2,2,1,1};
        System.out.println(sn.singleNumber(arr));
    }
}