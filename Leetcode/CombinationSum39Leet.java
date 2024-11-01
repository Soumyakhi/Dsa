import java.util.ArrayList;

public class CombinationSum39Leet {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        combinationSumHelper(candidates, res, new ArrayList<Integer>(), 0, 0, target);
        return res;
    }
    void combinationSumHelper(int[] candidates,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,int sum,int index,int target){
        if(sum>target){
            return;
        }
        if(sum==target){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]<=target){
                list.add(candidates[i]);
                combinationSumHelper(candidates, res, list, sum + candidates[i], i, target);
                list.remove(Integer.valueOf(candidates[i]));
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        ArrayList<ArrayList<Integer>>al=(new CombinationSum39Leet()).combinationSum(arr, 7);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
