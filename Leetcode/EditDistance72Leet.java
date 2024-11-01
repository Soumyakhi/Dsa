import java.util.Arrays;
public class EditDistance72Leet {
    int arr[][];
    public int minDistance(String word1, String word2) {
        arr=new int[word1.length()][word2.length()];
        for (int[] is : arr) {
            Arrays.fill(is, -1);
        }
        return helper(0, 0, word1, word2);
    }
    int helper(int index1,int index2,String word1, String word2){
        if(index1==word1.length()){
            return word2.length()-index2;
        }
        if(index2==word2.length()){
            return word1.length()-index1;
        }
        if(arr[index1][index2]!=-1){
            return arr[index1][index2];
        }
        int res;
        if(word1.charAt(index1)==word2.charAt(index2)){
            res=helper(index1+1, index2+1, word1, word2);
        }
        else{
            //insert
            int insert=1+helper(index1, index2+1, word1, word2);
            //delete
            int delete=1+helper(index1+1, index2, word1, word2);
            //replace
            int replace=1+helper(index1+1, index2+1, word1, word2);
            res=Math.min(Math.min(replace, insert),delete);
        }
        arr[index1][index2]=res;
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new EditDistance72Leet()).minDistance("intention", "execution"));
    }
}
