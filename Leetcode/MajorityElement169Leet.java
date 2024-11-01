import java.util.Arrays;

public class MajorityElement169Leet {
    public int majorityElement(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int k=i;
            while(k+1<nums.length && nums[k]==nums[k+1]){
                count++;
                k++;
            }
            if(count>=(nums.length/2)){
                return nums[i];
            }
            i=k;
        }
        return 0;
    }
    public static void main(String[] args) {
        MajorityElement169Leet me=new MajorityElement169Leet();
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(me.majorityElement(arr));
    }
}
