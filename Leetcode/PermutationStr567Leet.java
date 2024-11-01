import java.util.HashMap;
import java.util.HashSet;

public class PermutationStr567Leet {
    /*void perm(String str,String permutation,HashSet<String> perms){
        if(str.length()==0){
            perms.add(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            perm(newStr,permutation+currentChar,perms);
        }
    }*/
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            s1Count.put(ch, s1Count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            s2Count.put(ch, s2Count.getOrDefault(ch, 0) + 1);
        }
        if (s1Count.equals(s2Count)) {
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            char oldChar=s2.charAt(i-s1.length());
            char newChar=s2.charAt(i);
            if(s2Count.get(oldChar)==null || s2Count.get(oldChar)<2){
                s2Count.remove(oldChar);
            }
            else{
                s2Count.put(oldChar,s2Count.get(oldChar)-1);
            }
            s2Count.put(newChar,s2Count.getOrDefault(newChar,0)+1);
            if(s1Count.equals(s2Count)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new PermutationStr567Leet()).checkInclusion("adc", "bcda"));
    }
}
