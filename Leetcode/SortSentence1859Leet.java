import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortSentence1859Leet {
    public String sortSentence(String s) {
        String []stArr=s.split(" ");
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<stArr.length;i++) {
            hm.put(Integer.parseInt(stArr[i].substring(stArr[i].length()-1)),
            stArr[i].substring(0,stArr[i].length()-1));
        }
        ArrayList<Map.Entry<Integer,String>> list = new ArrayList<>(hm.entrySet());
        list.sort((a, b) -> {
            int valueCompare = a.getKey().compareTo(b.getKey());
            return valueCompare;
        });
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Integer,String> entry : list) {
            sb.append(entry.getValue()+" ");
        }
        return (sb.toString()).trim();
    }
    public static void main(String[] args) {
        System.out.println((new SortSentence1859Leet()).sortSentence("is2 sentence4 This1 a3"));
    }
}
