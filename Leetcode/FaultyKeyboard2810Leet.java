public class FaultyKeyboard2810Leet {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new FaultyKeyboard2810Leet()).finalString("string"));
    }
}
