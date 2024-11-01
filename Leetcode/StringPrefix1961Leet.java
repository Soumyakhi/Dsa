public class StringPrefix1961Leet {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for (String string : words) {
            sb.append(string);
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","love","leetcode","apples"};
        System.out.println((new StringPrefix1961Leet()).isPrefixString("iloveleetcode", words));
    }
}
