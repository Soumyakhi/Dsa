public class OccurenceOfString28Leet {
    public int strStr(String haystack, String needle) {
        
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0));
            int j=0,k=i;
            String newString="";
            while(j<needle.length() && k<haystack.length()){
                if(haystack.charAt(k)==needle.charAt(j)){
                    newString+=haystack.charAt(k);
                    
                }
                k++;
                j++;
            }
            if(newString.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        OccurenceOfString28Leet lr=new OccurenceOfString28Leet();
        System.out.println(lr.strStr("sadbutsad","buts"));
    }
    
}
