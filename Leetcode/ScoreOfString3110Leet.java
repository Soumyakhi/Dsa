public class ScoreOfString3110Leet {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum=sum+Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
        }
        return sum;
    }
    public static void main(String[] args) {
        ScoreOfString3110Leet so=new ScoreOfString3110Leet();
        System.out.println(so.scoreOfString("null"));
    }
}
