import java.util.HashMap;

public class FindWords1160Leet {
    
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (Character chr : chars.toCharArray()) {
            if(hm.containsKey(chr)){
                hm.put(chr, hm.get(chr)+1);
            }
            else{
                hm.put(chr,1);
            }
        }
        int sum=0;
        for (String string : words) {
            HashMap<Character,Integer> hm2=new HashMap<>(hm);
            boolean can=true;
            for (Character chr : string.toCharArray()) {
                if(hm2.containsKey(chr) && hm2.get(chr)>0){
                    hm2.put(chr,hm2.get(chr)-1);
                }
                else{
                    can=false;
                    break;
                }
            }
            if(can){
                sum+=string.length();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String []words={"hello","world","leetcode"};
        System.out.println((new FindWords1160Leet()).countCharacters(words, "welldonehoneyr"));
    }
}
