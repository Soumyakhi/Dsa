public class LongestSub521Leet {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(),b.length());
    }
    public static void main(String[] args) {
        System.out.println((new LongestSub521Leet()).findLUSlength("aba","cdc"));
    }
}
