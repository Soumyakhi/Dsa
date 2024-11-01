import java.util.HashMap;
import java.util.HashSet;

public class NumberOfWinning3238Leet {
    public int winningPlayerCount(int n, int[][] pick) {
        HashMap<String,Integer> hm=new HashMap<>();
        for (int[] is : pick) {
            String s=Integer.toString(is[0])+Integer.toString(is[1]);
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }
            else{
                hm.put(s, 1);
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        int []winners=new int[1];
        hm.forEach( (k, v) -> { 
            int key=Character.getNumericValue(k.charAt(0));
            if(key<v && !hs.contains(key)){
                winners[0]++;
                hs.add(key);
            } } );;
        return winners[0];
    }
    public static void main(String[] args) {
        int [][]pick={{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};
        System.out.println((new NumberOfWinning3238Leet()).winningPlayerCount(0, pick));
    }
}
