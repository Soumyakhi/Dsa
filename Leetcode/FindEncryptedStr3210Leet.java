public class FindEncryptedStr3210Leet {
    public String getEncryptedString(String s, int k) {
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            sb.append(s.charAt((i+k)%len));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new FindEncryptedStr3210Leet()).getEncryptedString("dart", 3));
    }
}
