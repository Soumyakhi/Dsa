import java.util.ArrayList;
public class RemoveElement27Leet {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> hm=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                hm.add(nums[i]);
            }
        }
        int i=0;
        for (Integer integer : hm) {
            nums[i]=integer;
            i++;
            System.out.println(integer);
        }
        return hm.size();
    }
    public static void main(String[] args) {
        int []a={0,1,2,2,3,0,4,2};
        int val=2;
        RemoveElement27Leet rm=new RemoveElement27Leet();
        System.out.println(rm.removeElement(a, val));
    }
}

