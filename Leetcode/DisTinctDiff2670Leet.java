import java.util.Arrays;
import java.util.HashSet;

public class DisTinctDiff2670Leet {
    public int[] distinctDifferenceArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count1=0,count2=0;
            HashSet<Integer> hs1=new HashSet<>();
            HashSet<Integer> hs2=new HashSet<>();
            for(int j=0;j<=i;j++){
                if(!hs1.contains(nums[j])){
                    count1++;
                    hs1.add(nums[j]);
                }
            }
            for(int j=i+1;j<nums.length;j++){
                if(!hs2.contains(nums[j])){
                    count2++;
                    hs2.add(nums[j]);
                }
            }
            arr[i]=count1-count2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        System.out.println(Arrays.toString((new DisTinctDiff2670Leet()).distinctDifferenceArray(nums)));
        
    }
}
