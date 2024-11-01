import java.util.ArrayList;
import java.util.Arrays;
public class SubSetsII90Leet {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> al =new ArrayList<>();
        dfs(0,al,res, nums);
        return res;
    }
    void dfs(int index,ArrayList<Integer> al,ArrayList<ArrayList<Integer>> res,int[] nums){
        if(index>=nums.length){
            res.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[index]);
        dfs(index+1, al, res, nums);
        al.remove(al.size()-1);
        int i=index;
        while (i<nums.length && nums[i]==nums[index]) {
            i++;
        }
        dfs(i, al, res, nums);
    }
    public static void main(String[] args) {
        int []arr={1,1,2};
        ArrayList<ArrayList<Integer>> al=(new SubSetsII90Leet()).subsetsWithDup(arr);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
    /*public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        //ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        HashSet<ArrayList<Integer>> resSet = new HashSet<>();
        ArrayList<Integer> al =new ArrayList<>();
        dfs(0,al,resSet, nums);
        return new ArrayList<>(resSet);
    }
    void dfs(int index,ArrayList<Integer> al,HashSet<ArrayList<Integer>> res,int[] nums){
        if(index>=nums.length){
            res.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[index]);
        dfs(index+1, al, res, nums);
        al.remove(al.size()-1);
        dfs(index+1, al, res, nums);
    } */
}
