import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestSubStr3Leet {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()>1){
        int arr[]=new int[s.length()],j=0;
        int k=0;
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))==false){
                hs.add(s.charAt(i));
                arr[j]=arr[j]+1;
            }
            else{
                i=k;
                k++;
                hs.clear();
                j++;
            }
        }
        int max=0;
        for(j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        return max;
    }
    else if(s.length()==1){
        return 1;
    }
    return 0;
    }
    public static void main(String[] args) {
        LargestSubStr3Leet lr=new LargestSubStr3Leet();
        System.out.println(lr.lengthOfLongestSubstring("dvdf"));
    }
}

