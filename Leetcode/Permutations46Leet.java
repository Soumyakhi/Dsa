import java.util.ArrayList;

public class Permutations46Leet {
    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        permutation(list,new ArrayList<>(),res);
        return res;
    }
    /*void permutation(ArrayList<Integer> list, ArrayList<Integer> currentPermutation, ArrayList<ArrayList<Integer>> res) {
        if (list.size() == 0) {
            res.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> list1=new ArrayList<>(list); 
            ArrayList<Integer> currentPermutation1=new ArrayList<>(currentPermutation); 
            Integer current = list1.remove(i);
            currentPermutation1.add(current);
            permutation(list1, currentPermutation1, res);
        }
    }*/
    void permutation(ArrayList<Integer> list, ArrayList<Integer> currentPermutation, ArrayList<ArrayList<Integer>> res) {
        if (list.isEmpty()) {
            res.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Integer current = list.remove(i);
            currentPermutation.add(current);
            permutation(list, currentPermutation, res);
            currentPermutation.remove(currentPermutation.size() - 1);
            list.add(i, current);
        }
    }
    
    public static void main(String[] args) {
        int []arr={1,2,3};
        ArrayList<ArrayList<Integer>> al=(new Permutations46Leet()).permute(arr);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
