import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ZeroOneLoss2225Leet {
    public ArrayList<ArrayList<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> winners=new HashSet<>();
        HashMap<Integer,Integer> losers=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winners.add(matches[i][0]);
            if(losers.containsKey(matches[i][1])){
                losers.put(matches[i][1], 2);
            }
            else{
                losers.put(matches[i][1], 1);
            }
        }
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> zero=new ArrayList<>();
        ArrayList<Integer> one=new ArrayList<>();
        for (Integer integer : winners) {
            if(!losers.containsKey(integer)){
                zero.add(integer);
            }
        }
        losers.forEach((k,v)->{
            if(v==1){
                one.add(k);
            }
        });
        Collections.sort(zero);
        Collections.sort(one);
        al.add(zero);
        al.add(one);
        return al;
    }
    public static void main(String[] args) {
        int [][]arr={{2,3},{1,3},{5,4},{6,4}};
        ArrayList<ArrayList<Integer>> al=(new ZeroOneLoss2225Leet()).findWinners(arr);
        for (ArrayList<Integer> arrayList : al) {
            System.out.println(al);
        }
    }
}
