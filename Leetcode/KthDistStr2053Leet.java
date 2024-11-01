import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class KthDistStr2053Leet {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet <String> ts = new LinkedHashSet<>();
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(ts.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                ts.add(arr[i]);
            }
        }
        for (String string : hs) {
            ts.remove(string);
        }
        int i=1;
        for (String string : ts) {
            if(i==k){
                return string;
            }
            i++;
        }
        return "";
    }
    public static void main(String[] args) {
        String []arr={"d","b","c","b","c","a"};
        System.out.println((new KthDistStr2053Leet()).kthDistinct(arr, 2));
    }
}
