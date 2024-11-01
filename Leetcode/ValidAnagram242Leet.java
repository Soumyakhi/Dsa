import java.util.Arrays;

public class ValidAnagram242Leet {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() || s.length()==0 || t.length()==0){
            return false; 
        }
        char[]arr1=new char[s.length()];
        char[]arr2=new char[t.length()];
        for(int i=0;i<s.length();i++){
            arr1[i]=s.charAt(i);
            arr2[i]=t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ValidAnagram242Leet vm=new ValidAnagram242Leet();
        System.out.println(vm.isAnagram("anagram", "nagaram"));
    }
}
