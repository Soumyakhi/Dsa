import java.util.*;

public class LongestSubStr3Leet {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        char arr[]=s.toCharArray();
        Map<Character,Integer> charMap=new HashMap<>();
        int maxLen=1;
        int start=0,end=0;
        charMap.put(s.charAt(0), 0);
        for(int i=1;i<s.length();i++){
            if(charMap.containsKey(arr[i])){  
                start=Math.max(charMap.get(arr[i])+1,start);
            }
            charMap.put(arr[i], i);
            end++;
            maxLen=Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println((new LongestSubStr3Leet()).lengthOfLongestSubstring("abcabcbb"));
    }
}
