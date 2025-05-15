import java.util.ArrayList;
import java.util.List;

public class LongestUniq2900Leet {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> wordList=new ArrayList<>();
        wordList.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(groups[i-1]!=groups[i]){
                wordList.add(words[i]);
            }
        }
        return wordList;
    }
    public static void main(String[] args) {
        String arr[]={"a","b","c","d"};
        int brr[]={1,0,1,1};
        System.out.println((new LongestUniq2900Leet()).getLongestSubsequence(arr, brr));
    }
}
