import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortPeople2418Leet {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int index=0;
        for(int i=heights.length-1;i>-1;i--) {
            names[index++]=hm.get(heights[i]);
        }
        return names;
    }
    public static void main(String[] args) {
        String []a={"Mary","John","Emma"};
        int []height={180,165,170};
        String []x=(new SortPeople2418Leet()).sortPeople(a, height);
        for (String string : x) {
            System.out.println(string);
        }
    }
}
