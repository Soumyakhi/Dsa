import java.util.*;
public class DifferenceOfTwoArrays2215Leet {
    public ArrayList<ArrayList<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        for (int num : nums1) {
            hs1.add(num);
        }
        HashSet<Integer> hs2=new HashSet<>();
        for (int num : nums2) {
            hs2.add(num);
        }
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for (Integer num : hs1) {
            if(!hs2.contains(num)){
                al1.add(num);
            }
        }
        for (Integer num : hs2) {
            if(!hs1.contains(num)){
                al2.add(num);
            }
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        res.add(al1);
        res.add(al2);
        return res;
    }
    public static void main(String[] args) {
        
    }
}
