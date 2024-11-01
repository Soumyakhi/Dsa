import java.util.ArrayList;
import java.util.HashSet;

public class TwoOutOfThree2032Leet {
    public ArrayList<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hsr=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        HashSet<Integer> hs3=new HashSet<>();
        for (Integer integer : nums1) {
            hsr.add(integer);
            hs1.add(integer);
        }
        for (Integer integer : nums2) {
            hsr.add(integer);
            hs2.add(integer);
        }
        for (Integer integer : nums3) {
            hsr.add(integer);
            hs3.add(integer);
        }
        for (Integer integer : hsr) {
            int count=0;
            if(hs1.contains(integer)){
                count++;
            }
            if(hs2.contains(integer)){
                count++;
            }
            if(hs3.contains(integer)){
                count++;
            }
            if(count>1){
                al.add(integer);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int []arr1={1,1,3,2};
        int []arr2={2,3};
        int []arr3={3};
        TwoOutOfThree2032Leet tot=new TwoOutOfThree2032Leet();
        System.out.println(tot.twoOutOfThree(arr1, arr2, arr3));
    }
}
