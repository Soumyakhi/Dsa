import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDulii80Leet {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : nums) {
            if(hm.containsKey(i) && hm.get(i)<2){
                int val=hm.get(i)+1;
                hm.put(i, val);
            }
            else if(!hm.containsKey(i)){
                hm.put(i,1);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.MAX_VALUE;
        }
        int index[]={0};
        hm.forEach((k, v)->
            {
                for(int i=1;i<=v;i++){
                    nums[index[0]++]=k;
                }
            });
        Arrays.sort(nums);
        return index[0];
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println((new RemoveDulii80Leet()).removeDuplicates(arr));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
