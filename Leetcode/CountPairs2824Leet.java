import java.util.*;

public class CountPairs2824Leet {
    public int countPairs(ArrayList<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                    if(nums.get(i)+nums.get(j)<target){
                        count++;
                    }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(-1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        CountPairs2824Leet cp=new CountPairs2824Leet();
        System.out.println(cp.countPairs(al, 2));
    }
}
