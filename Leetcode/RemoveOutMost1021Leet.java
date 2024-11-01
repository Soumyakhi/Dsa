public class RemoveOutMost1021Leet {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int countl=0,countr=0;
        for (char ch : s.toCharArray()) {
            if(ch=='('){
                if(countl==0){
                    countl++;
                }
                else{
                    sb.append(ch);
                    countl++;
                }
            }
            if(ch==')'){
                countr++;
                if(countl==countr){
                    countl=0;
                    countr=0;
                }
                else{
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new RemoveOutMost1021Leet()).removeOuterParentheses("(()())(())"));
    }
}
