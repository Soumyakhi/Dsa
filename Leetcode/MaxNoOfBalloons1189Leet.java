import java.util.HashMap;

public class MaxNoOfBalloons1189Leet {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char c : text.toCharArray()) {
            if(c=='b'||c=='a'||c=='n'){
                hm.put(c, hm.getOrDefault(c, 0)+2);
            }
            if(c=='l'||c=='o'){
                hm.put(c, hm.getOrDefault(c, 0)+1);
            }
        }
        if(hm.size()!=5 || hm.get('l')<2 || hm.get('o')<2){
            return 0;
        }
        int min[]={Integer.MAX_VALUE};
        hm.forEach((k,v)->{
            min[0]=Math.min(min[0], v);
        });
        return min[0]/2;
    }
    public static void main(String[] args) {
        System.out.println((new MaxNoOfBalloons1189Leet()).maxNumberOfBalloons("loonbalxballpoon"));
    }
}
