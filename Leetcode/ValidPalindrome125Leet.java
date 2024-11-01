public class ValidPalindrome125Leet {
    /*public boolean isPalindrome(String s) {
        String newStr="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                newStr+=s.charAt(i);
            }
        }
        newStr=newStr.toLowerCase();
        StringBuilder res=new StringBuilder("");
        for(int i=newStr.length()-1;i>=0;i--){
            res.append(newStr.charAt(i));
        }
        return newStr.equals(res.toString());
    }*/
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder newStr=new StringBuilder();
        StringBuilder res=new StringBuilder();
        int start=0,end=s.length()-1;
        while (start<s.length()) {
            if(Character.isAlphabetic(s.charAt(start)) || Character.isDigit(s.charAt(start))){
                newStr.append(s.charAt(start));
            }
            if(Character.isAlphabetic(s.charAt(end)) || Character.isDigit(s.charAt(end))){
                res.append(s.charAt(end));
            }
            start++;
            end--;
        }
        return (newStr.toString()).equals(res.toString());
    }
    public static void main(String[] args) {
        ValidPalindrome125Leet vp=new ValidPalindrome125Leet();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
