import java.util.HashMap;

public class LongestCommonSubSeq1143Leet {
    public int longestCommonSubsequence(String text1, String text2) {
        return maxRes(0, 0, text1, text2,new HashMap<>());
    }
    int maxRes(int index1,int index2,String str1,String str2,HashMap<String,Integer> hm){
        if(index1>=str1.length() || index2>=str2.length()){
            return 0;
        }
        String key=index1+","+index2;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int res;
        if(str1.charAt(index1)==str2.charAt(index2)){
            res=1+maxRes(index1+1, index2+1, str1, str2,hm);

        }else{
            res=Math.max(maxRes(index1+1, index2, str1, str2,hm),
                maxRes(index1, index2+1, str1, str2,hm));
        }
        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new LongestCommonSubSeq1143Leet())
        .longestCommonSubsequence("abcde","ace"));
    }
}
