import java.util.Arrays;
public class TwoSum1Leet {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        int []newNums=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newNums[i]=nums[i];
        }
        int a=0,b=nums.length-1;
        Arrays.sort(nums);
        while(a<b){
            if(nums[a]+nums[b]==target){
                arr[0]=nums[a];
                arr[1]=nums[b];
                break;
            }
            if(nums[a]+nums[b]>target){
                b--;
                
                
            }
            if(nums[a]+nums[b]<target){
                
                a++;
            }
            
        }
        int brr[]=new int[2];
        brr[0]=-1;
        brr[1]=-1;
        for(int i=0;i<newNums.length;i++){
            if(arr[0]==newNums[i] && brr[0]==-1){
                brr[0]=i;
            }
            else if(arr[1]==newNums[i] && brr[1]==-1){
                brr[1]=i;
            }

        }
        return brr;
    }
    public static void main(String[] args) {
        TwoSum1Leet ts=new TwoSum1Leet();
        int []a={-18,12,3,0};
        int []b=ts.twoSum(a,-6);
        System.out.println("two sum are "+b[0]+" and "+b[1]);
    }
    
}
