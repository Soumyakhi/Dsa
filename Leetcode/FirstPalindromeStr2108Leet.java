public class FirstPalindromeStr2108Leet {
    public String firstPalindrome(String[] words) {
        for (String string : words) {
            StringBuilder sb=new StringBuilder(string);
            if(string.equals((sb.reverse()).toString())){
                System.gc();
                return string;
            }
        }
        System.gc();
        return "";
    }
    public static void main(String[] args) {
        String []s={"abc","car","ada","racecar","cool"};
        System.out.println((new FirstPalindromeStr2108Leet()).firstPalindrome(s));
    }
}
