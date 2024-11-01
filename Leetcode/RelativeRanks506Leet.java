import java.util.*;

public class RelativeRanks506Leet {
    public String[] findRelativeRanks(int[] score) {
        String s[]=new String[score.length];
        int b[] = score.clone(); 
        Arrays.sort(score);
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=score.length-1;i>-1;i--) {
            if(al.indexOf(score[i])==-1){
                al.add(score[i]);
            }
        }
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<al.size();i++){
            if(i==0){
                hm.put(al.get(i), "Gold Medal");
            }
            else if(i==1){
                hm.put(al.get(i), "Silver Medal");
            }
            else if(i==2){
                hm.put(al.get(i), "Bronze Medal");
            }
            else{
                hm.put(al.get(i),Integer.toString(i+1));
            }
        }
        for(int i=0;i<s.length;i++){
            s[i]=hm.get(b[i]);
        }
        return s;
    }
    public static void main(String[] args) {
        RelativeRanks506Leet rl=new RelativeRanks506Leet();
        int[] score={5,4,3,2,1};
        String[] res=rl.findRelativeRanks(score);
        for (String string : res) {
            System.out.println(string);
        }
    }
}
