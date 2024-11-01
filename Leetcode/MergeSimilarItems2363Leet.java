import java.util.*;
import java.util.List;

public class MergeSimilarItems2363Leet {
    public ArrayList<ArrayList<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int[] is : items1) {
            hm.put(is[0], is[1]);
        }
        for (int[] is : items2) {
            if(hm.containsKey(is[0])){
                hm.put(is[0], is[1]+hm.get(is[0]));
            }
            else{
                hm.put(is[0], is[1]);
            }
        }
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        hm.forEach((k,v)->{
            ArrayList<Integer> al1=new ArrayList<>();
            al1.add(k);
            al1.add(v);
            al.add(al1);
        });
        al.sort((a, b) -> {
            int valueCompare = a.get(0).compareTo(b.get(0));
            if (valueCompare == 0) {
                return 1;
            }
            return valueCompare;
        });
        return al;
    }
    public static void main(String[] args) {
        int arr1[][]={{1,1},{4,5},{3,8}};
        int arr2[][]={{3,1},{1,5}};
        ArrayList<ArrayList<Integer>> al=(new MergeSimilarItems2363Leet()).mergeSimilarItems(arr1,arr2);
        for (ArrayList<Integer> is : al) {
            System.out.println(is);
        }
    }
}
