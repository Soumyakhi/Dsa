import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargestDigit1769Leet {
    public int secondHighest(String s) {
        if(s.length()==0){
            return -1;
        }
        if(s.length()==1){
            return -1;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                hs.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        if(hs.isEmpty()){
            return -1;
        }
        ArrayList<Integer> list = new ArrayList<Integer>(hs);
        Collections.sort(list);
        if(list.size()<2){
            return -1;
        }
        return list.get(list.size()-2);
    }
    public static void main(String[] args) {
        SecondLargestDigit1769Leet sd=new SecondLargestDigit1769Leet();
        System.out.println(sd.secondHighest("a13354974"));
    }
}
