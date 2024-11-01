import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementII229Leet {
    public ArrayList<Integer> majorityElement(int[] nums) {
        int maxSize[]={nums.length/3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        hm.forEach((k,v)->{
            if(v>maxSize[0]){
                al.add(k);
            }
        });
        return al;
    }
    public static void main(String[] args) {
        int []nums={3,2,3};
        System.out.println((new MajorityElementII229Leet()).majorityElement(nums));
    }
}
