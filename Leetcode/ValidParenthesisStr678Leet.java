public class ValidParenthesisStr678Leet {
    public boolean checkValidString(String s) {
        char []chrArr=s.toCharArray();
        int leftMin=0,leftMax=0;
        for(int i=0;i<chrArr.length;i++){
            if(chrArr[i]=='('){
                leftMin++;
                leftMax++;
            }
            else if(chrArr[i]==')'){
                leftMin--;
                leftMax--;
            }
            else{
                leftMin--;
                leftMax++;
            }
            if(leftMin==-1){
                leftMin=0;
            }
            if(leftMax==-1){
                return false;
            }
        }
        return leftMin==0; 
    }
    public static void main(String[] args) {
        System.out.println((new ValidParenthesisStr678Leet()).checkValidString("(*))"));
    }
}
