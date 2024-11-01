import java.util.HashMap;

public class WordPattern290Leet {
    public boolean wordPattern(String pattern, String s) {
        int index1=0,index2=0;
        String arr[]=s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        for (Character chr : pattern.toCharArray()) {
            if(!hm1.containsKey(chr)){
                hm1.put(chr, index1++);
            }
        }
        for (String string : arr) {
            if(!hm2.containsKey(string)){
                hm2.put(string, index2++);
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (Character chr : pattern.toCharArray()) {
            sb1.append(hm1.get(chr));
        }
        for (String string : arr) {
            sb2.append(hm2.get(string));
        }
        return (sb1.toString()).equals(sb2.toString());
    }
    public static void main(String[] args) {
        System.out.println((new WordPattern290Leet()).wordPattern("abba", "dog cat cat dog"));
    }
}
