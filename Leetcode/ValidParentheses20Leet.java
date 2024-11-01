import java.util.Stack;

public class ValidParentheses20Leet {
    public boolean isValid(String s) {
        if(s.length()%2==0){
        Stack<Character> c=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(i==s.length()-1){
                    return false;
                }
                c.push('(');
            }
            else if(s.charAt(i)=='{'){
                if(i==s.length()-1){
                    return false;
                }
                c.push('{');
            }
            else if(s.charAt(i)=='['){
                if(i==s.length()-1){
                    return false;
                }
                c.push('[');
            }
            else if(s.charAt(i)==')' && c.isEmpty()==false){
                if(c.peek()=='('){
                    c.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==')' && c.isEmpty()==true){
                
                    return false;
                
            }
            else if(s.charAt(i)=='}' && c.isEmpty()==false){
                if(c.peek()=='{'){
                    c.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==')' && c.isEmpty()==true){
                
                return false;
            
            }
            else if(s.charAt(i)==']' && c.isEmpty()==false){
                if(c.peek()=='['){
                    c.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']' && c.isEmpty()==true){
                
                return false;
            
            }
        }
        if(c.isEmpty()==true){
            return true;
        }
        return false;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
