public class ReverseWordsIII557Leet {
    public String reverseWords(String s) {
        String []x=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (String string : x) {
            StringBuilder sb1=new StringBuilder(string);
            sb1.reverse();
            sb.append(sb1.toString()+" ");
        }
        return (sb.toString()).trim();
    }
    public static void main(String[] args) {
        System.out.println((new ReverseWordsIII557Leet()).reverseWords("s'teL ekat edoCteeL tsetnoc"));
    }
}
