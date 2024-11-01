import java.util.ArrayList;

public class Subsets78Leet {
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
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
        dfs(index+1, al, res, nums);
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        ArrayList<ArrayList<Integer>> al=(new Subsets78Leet()).subsets(arr);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
