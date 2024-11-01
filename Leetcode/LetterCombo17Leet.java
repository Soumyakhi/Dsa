import java.util.ArrayList;

public class LetterCombo17Leet {
    void printCombinations(String str, int index, StringBuilder combination, String[] keypad,ArrayList<String> al) {
        if (index == str.length()) {
            if(combination.length()>0)
            al.add(combination.toString());
            return;
        }
        int currentChar = Character.getNumericValue(str.charAt(index))-2;
        for (int i = 0; i < keypad[currentChar].length(); i++) {
            printCombinations(str, index + 1, combination.append(keypad[currentChar].charAt(i)), keypad,al);
            combination.deleteCharAt(combination.length()-1);
        }
    }
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> al=new ArrayList<>();
        String[] keypad = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        printCombinations(digits, 0, new StringBuilder(), keypad,al);
        return al;
    }
    public static void main(String[] args) {
        System.out.println((new LetterCombo17Leet()).letterCombinations("23"));
    }
    
}
