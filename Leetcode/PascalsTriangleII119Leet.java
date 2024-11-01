import java.util.ArrayList;

public class PascalsTriangleII119Leet {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        for(int i=1;i<rowIndex;i++){
            int size=al.size();
            ArrayList<Integer> temp=new ArrayList<>(al);
            temp.add(0,0);
            temp.add(0);
            al=new ArrayList<>();
            for(int j=0;j<size+1;j++){
                al.add(temp.get(j)+temp.get(j+1));
            }
        }
        return al;
    }
    

    public static void main(String[] args) {
        System.out.println((new PascalsTriangleII119Leet()).getRow(5));
        
    }
}
