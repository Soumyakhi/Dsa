import java.util.*;
public class NumberOfSubStr1358Leet {
    public int numberOfSubstrings(String s) {
        int arr[]={-1,-1,-1},total=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                total+=Math.min(Math.min(arr[0],arr[1]),arr[2])+1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println((new NumberOfSubStr1358Leet()).numberOfSubstrings("abcabc"));
    }
}
