import java.util.ArrayList;
import java.util.HashSet;

public class PermutationII47Leet {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] nums) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        permutation(list,new ArrayList<>(),res,new HashSet<>());
        return res;
    }
    void permutation(ArrayList<Integer> list, ArrayList<Integer> currentPermutation, ArrayList<ArrayList<Integer>> res
    ,HashSet<ArrayList<Integer>> hs) {
        if (list.isEmpty()) {
            if(!hs.contains(currentPermutation)){
                res.add(new ArrayList<>(currentPermutation));
                hs.add(new ArrayList<>(currentPermutation));
            }
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Integer current = list.remove(i);
            currentPermutation.add(current);
            permutation(list, currentPermutation, res,hs);
            currentPermutation.remove(currentPermutation.size() - 1);
            list.add(i, current);
        }
    }
    public static void main(String[] args) {
        int []arr={1,1,2};
        System.out.println((new PermutationII47Leet()).permuteUnique(arr));

    }
}
