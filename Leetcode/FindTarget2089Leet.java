import java.util.ArrayList;
import java.util.Arrays;

public class FindTarget2089Leet {
    public ArrayList<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(nums);
        /*int l=0,r=nums.length-1;
        while (l<=r) {
            int mid=(l+r)/2;
            if(nums[mid]==target){
                int i=mid-1,j=mid+1;
                while (i>=0 && nums[i]==target) {
                    al.add(i);
                    i--;
                }
                al.add(mid);
                while (j<=nums.length-1 && nums[j]==target) {
                    al.add(j);
                    j++;
                }
                break;
            }
            else if(nums[mid]>target){
                r=mid-1;
                
            }
            else{
                l=mid+1;
            }
        }*/
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                al.add(i);
                i++;
                while(i<nums.length && nums[i]==target){
                    al.add(i);
                    i++;
                }
                break;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int []nums={1,2,5,2,3};
        System.out.println((new FindTarget2089Leet()).targetIndices(nums, 3));
    }
}
