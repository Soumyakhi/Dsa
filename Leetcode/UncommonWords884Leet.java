import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UncommonWords884Leet {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> al=new ArrayList<>();
        HashMap<String,Integer>hm1=new HashMap<>();
        HashMap<String,Integer>hm2=new HashMap<>();
        String s1Arr[]=s1.split(" ");
        String s2Arr[]=s2.split(" ");
        for (String string : s1Arr) {
            hm1.put(string, hm1.getOrDefault(string, 0)+1);
        }
        for (String string : s2Arr) {
            hm2.put(string, hm2.getOrDefault(string, 0)+1);
        }
        hm1.forEach((k,v)->{
            if(!hm2.containsKey(k) && v<2){
                al.add(k);
            }
        });
        hm2.forEach((k,v)->{
            if(!hm1.containsKey(k) && v<2){
                al.add(k);
            }
        });
        String res[]=new String[al.size()];
        int index=0;
        for (String string : al) {
            res[index++]=string;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString((new UncommonWords884Leet()).uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }
}
