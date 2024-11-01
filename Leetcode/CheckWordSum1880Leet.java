import java.util.HashMap;
import java.util.Map;

public class CheckWordSum1880Leet {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character, Integer> hashmap = new HashMap<>();
        for (char c = 'a'; c <= 'j'; c++) {
            hashmap.put(c, (c - 'a'));
        }
        char []arr1=firstWord.toCharArray();
        char []arr2=secondWord.toCharArray();
        char []arr3=targetWord.toCharArray();
        int sum1=0,sum2=0,sum3=0;
        for (char c : arr1) {
            sum1=sum1*10+hashmap.get(c);
        }
        for (char c : arr2) {
            sum2=sum2*10+hashmap.get(c);
        }
        for (char c : arr3) {
            sum3=sum3*10+hashmap.get(c);
        }
        return (sum1+sum2)==sum3;
    }
    public static void main(String[] args) {
        CheckWordSum1880Leet cw=new CheckWordSum1880Leet();
        System.out.println(cw.isSumEqual("j", "j", "bi"));
    }
}
