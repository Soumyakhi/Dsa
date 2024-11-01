import java.util.ArrayList;

public class CheckAsc2024Leet {
    public boolean areNumbersAscending(String s) {
        String st[]=s.split(" ");
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<st.length;i++) {
            try {
                al.add(Integer.parseInt(st[i]));
            } catch (NumberFormatException e) {
            }
        }
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((new CheckAsc2024Leet()).areNumbersAscending(
            "sunset is at 7 10 pm overnight lows will be in the low 50 and 60 s"));
    }
}
