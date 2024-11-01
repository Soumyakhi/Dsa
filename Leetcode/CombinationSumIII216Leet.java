import java.util.ArrayList;

public class CombinationSumIII216Leet {
    public ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        backTrack(1, k, 0, n, new ArrayList<>(), res);
        return res;
    }
    void backTrack(int index, int limit, int sum, int target, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> res) {
        if (al.size() == limit) {
            if (sum == target) { 
                res.add(new ArrayList<>(al));
            }
            return;
        }
        if (sum > target || index > 9) {
            return;
        }
        al.add(index);
        backTrack(index + 1, limit, sum + index, target, al, res);
        al.remove(al.size() - 1);
        backTrack(index + 1, limit, sum, target, al, res);
    }
    public static void main(String[] args) {
        System.out.println((new CombinationSumIII216Leet()).combinationSum3(3, 7));
    }
}
