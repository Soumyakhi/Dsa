import java.util.HashMap;

public class InterleavingString97Leet {
    HashMap<String,Boolean> hm=new HashMap<>();
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        return helper(s1, s2, s3, 0, 0, 0);
    }
    boolean helper(String s1,String s2,String s3,int index1,int index2,int index3){
        if(index3==s3.length()){
            return true;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(index1);
        sb.append(',');
        sb.append(index2);
        String key=sb.toString();
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        boolean first=false;
        if(index1<s1.length() && s1.charAt(index1)==s3.charAt(index3)){
            first=helper(s1, s2, s3, index1+1, index2, index3+1);
        }
        boolean second=false;
        if(index2<s2.length() && s2.charAt(index2)==s3.charAt(index3)){
            second=helper(s1, s2, s3, index1, index2+1, index3+1);
        }
        boolean res=first||second;
        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new InterleavingString97Leet()).
        isInterleave( "aabcc","dbbca","aadbbcbcac"));
    }
}
