import java.util.ArrayList;

public class StringMatching1408Leet {
    public ArrayList<String> stringMatching(String[] words) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(words[j].contains(words[i])){
                        al.add(words[i]);
                        break;
                    }
                }
            }
        }
        return al;
    }
    public static void main(String[] args) {
        String []a={"mass","as","hero","superhero"};
        System.out.println((new StringMatching1408Leet()).stringMatching(a));
    }
}
