public class MInimumOper3190Leet {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                if((nums[i]+1)%3==0){
                    nums[i]+=1;
                    count++;
                }
                else if((nums[i]-1)%3==0){
                    nums[i]-=1;
                    count++;
                }
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println((new MInimumOper3190Leet()).minimumOperations(arr));
    }
}
