public class MergeStrings1768Leet {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0){
            return word2;
        }
        if(word2.length()==0){
            return word1;
        }
        String newStr="";
        int ptr1=0,ptr2=0;
        while (ptr1<word1.length() && ptr2<word2.length()) {
            newStr=newStr+word1.charAt(ptr1);
            newStr=newStr+word2.charAt(ptr2);
            ptr1++;
            ptr2++;
        }
        while (ptr1<word1.length()) {
            newStr=newStr+word1.charAt(ptr1);
            ptr1++;
        }
        while (ptr2<word2.length()) {
            newStr=newStr+word2.charAt(ptr2);
            ptr2++;
        }
        return newStr;
    }
    public static void main(String[] args) {
        MergeStrings1768Leet mg=new MergeStrings1768Leet();
        System.out.println(mg.mergeAlternately("abc", "pqr"));
    }
}
