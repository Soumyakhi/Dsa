import java.util.ArrayList;
import java.util.Arrays;
public class CombinationSumII40Leet {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        combinationSumHelper(candidates, res, new ArrayList<Integer>(), 0, 0, target);
        return res;
    }
    void combinationSumHelper(int[] candidates,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,int sum,int index,int target){
        if(sum==target){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }
        list.add(candidates[index]);
        combinationSumHelper(candidates, res, list, sum + candidates[index], index+1, target);
        list.remove(list.size()-1);
        while (index+1<candidates.length && candidates[index]==candidates[index+1]) {
            index++;
        }
        combinationSumHelper(candidates, res, list, sum, index+1, target);
    }
    public static void main(String[] args) {
        int arr[]={2,5,2,1,2};
        ArrayList<ArrayList<Integer>>al=(new CombinationSumII40Leet()).combinationSum2(arr, 5);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
