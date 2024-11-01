import java.util.ArrayList;

public class PascalsTriangle118Leet {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        res.add(al);
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> temp=new ArrayList<>(res.get(i-1));
            temp.add(0,0);
            temp.add(0);
            ArrayList<Integer> newArrayList=new ArrayList<>();
            for(int j=0;j<res.get(i-1).size()+1;j++){
                newArrayList.add(temp.get(j)+temp.get(j+1));
            }
            res.add(newArrayList);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res=(new PascalsTriangle118Leet()).generate(5);
        for (ArrayList<Integer> arrayList : res) {
            System.out.println(arrayList);
        }
    }
}
