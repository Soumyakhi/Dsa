import java.util.HashSet;

public class GCDStrings1071Leet {
    public boolean isDivisor(int l, String str1, String str2) {
        if (str1.length() % l != 0 || str2.length() % l != 0) {
            return false;
        }
        int fact1 = str1.length() / l;
        int fact2 = str2.length() / l;
        String repeated1 = str1.substring(0, l).repeat(fact1);
        String repeated2 = str2.substring(0, l).repeat(fact2);
        return repeated1.equals(str1) && repeated2.equals(str2) && (str1.substring(0, l)).equals(str2.substring(0, l));
    }
    
    public String gcdOfStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = len; i > 0; i--) {
            if (isDivisor(i, str1, str2)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        GCDStrings1071Leet gcd=new GCDStrings1071Leet();
        System.out.println(gcd.gcdOfStrings("ABCABC", "ABC"));
    }
}
