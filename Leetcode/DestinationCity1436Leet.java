import java.util.ArrayList;
import java.util.HashSet;

public class DestinationCity1436Leet {
    public String destCity(ArrayList<ArrayList<String>> paths) {
        HashSet<String> hs1=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        for (ArrayList<String> al : paths) {
            hs1.add(al.get(0));
            hs2.add(al.get(1));
        }
        for (String string : hs2) {
            if(!hs1.contains(string)){
                return string;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        
    }
}
