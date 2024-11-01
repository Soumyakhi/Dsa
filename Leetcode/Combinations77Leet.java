import java.util.ArrayList;

public class Combinations77Leet {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(k==n){
            res.add(al);
            return res;
        }
        helper(k, 0, res, al, new ArrayList<>());
        return res;    
    }
    void helper(int k,int index,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> al,ArrayList<Integer> combination){
        if(combination.size()==k){
            res.add(new ArrayList<>(combination));
            return;
        }
        if(index>=al.size()){
            return;
        }
        for(int i=index;i<al.size();i++){
            combination.add(al.get(i));
            helper(k, i+1, res, al, combination);
            combination.remove(combination.size()-1);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al=(new Combinations77Leet()).combine(4, 2);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(arrayList);
        }
    }
}
