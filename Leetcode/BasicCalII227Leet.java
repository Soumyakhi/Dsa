import java.util.Stack;

public class BasicCalII227Leet {
    public int calculate(String s) {
        s = s.replace(" ", "");
        Stack<Integer> st = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(currentChar);
            }
            if (!Character.isDigit(currentChar) || i == s.length() - 1) {
                if (operation == '+') {
                    st.push(currentNumber);
                } else if (operation == '-') {
                    st.push(-currentNumber);
                } else if (operation == '*') {
                    st.push(st.pop() * currentNumber);
                } else if (operation == '/') {
                    st.push(st.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        
        return sum;
    }
    public static void main(String[] args) {
        System.out.println((new BasicCalII227Leet()).calculate("0-2147483647"));
    }
}
