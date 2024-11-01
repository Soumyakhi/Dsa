import java.util.HashMap;

public class FirstUniqueChar387Leet {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (Character chr : s.toCharArray()) {
            if(hm.containsKey(chr)){
                hm.put(chr, 2);
            }
            else{
                hm.put(chr, 1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println((new FirstUniqueChar387Leet()).firstUniqChar("loveleetcode"));
    }
}
