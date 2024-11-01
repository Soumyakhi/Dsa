import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNoOccur1207Leet {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : arr) {
            if(hm.containsKey(i)){
                int no=hm.get(i)+1;
                hm.put(i, no);
            }
            else{
                hm.put(i, 1);
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        hm.forEach((key, value) -> { 
            al.add(value);
            hs.add(value);
        });
        if(hs.size()==al.size()){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,1,1,3};
        UniqueNoOccur1207Leet un=new UniqueNoOccur1207Leet();
        System.out.println(un.uniqueOccurrences(arr));
    }
}
