public class ABeforeB2121Leet {
    public boolean checkString(String s) {
        int a=-1;
        int b=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a=Math.max(a, i);
            }
            else{
                if(b==-1){
                    b=i;
                }
            }
        }
        if(b==-1){
            return false;
        }
        return a<b;
    }
    public static void main(String[] args) {
        System.out.println((new ABeforeB2121Leet()).checkString("aaababb"));
    }
}
