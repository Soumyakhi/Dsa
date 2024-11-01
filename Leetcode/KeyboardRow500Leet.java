import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class KeyboardRow500Leet {
    public String[] findWords(String[] words) {
        HashSet<Character> row1=new HashSet<>();
        HashSet<Character> row2=new HashSet<>();
        HashSet<Character> row3=new HashSet<>();
        for (char character : "qwertyuiop".toCharArray()) {
            row1.add(character);
        }
        for (char character : "asdfghjkl".toCharArray()) {
            row2.add(character);
        }
        for (char character : "zxcvbnm".toCharArray()) {
            row3.add(character);
        }
        ArrayList<String> al=new ArrayList<>();
        for (String word : words) {
            char[] wordsArr=word.toLowerCase().toCharArray();
            if(row1.contains(wordsArr[0])){
                boolean canForm=true;
                for (char chr : wordsArr) {
                    if(!row1.contains(chr)){
                        canForm=false;
                        break;
                    }
                }
                if(canForm){
                    al.add(word);
                }
            }
            else if(row2.contains(wordsArr[0])){
                boolean canForm=true;
                for (char chr : wordsArr) {
                    if(!row2.contains(chr)){
                        canForm=false;
                        break;
                    }
                }
                if(canForm){
                    al.add(word);
                }
            }
            else{
                boolean canForm=true;
                for (char chr :wordsArr) {
                    if(!row3.contains(chr)){
                        canForm=false;
                        break;
                    }
                }
                if(canForm){
                    al.add(word);
                } 
            }
        }
        String str[]=new String[al.size()];
        int index=0;
        for (String string : al) {
            str[index++]=string;
        }
        return str;
    }
    public static void main(String[] args) {
        String[]arr={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString((new KeyboardRow500Leet()).findWords(arr)));
    }
}
