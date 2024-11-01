import java.util.ArrayList;

public class ReverseVowels345Leet {
    public String reverseVowels(String s) {
        if(s.length()<=1){
            return s;
        }
        ArrayList<Character> al=new ArrayList<>();
        for(int i=(s.length()-1);i>-1;i--){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' ||
            s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'
            || s.charAt(i)=='U'){
                al.add(s.charAt(i));
            }
        }
        int index=0;
        String newStr="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' ||
            s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'
            || s.charAt(i)=='U'){
                newStr+=al.get(index);
                index++;
            }
            else{
                newStr+=s.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        ReverseVowels345Leet rv=new ReverseVowels345Leet();
        System.out.println(rv.reverseVowels("leetcode")); 
    }
}
