import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RankByVotes1366Leet {
    public String rankTeams(String[] votes) {
        int len=votes[0].length();
        HashMap<Character,int[]> hm=new HashMap<>();
        for (String string : votes) {
            for(int i=0;i<len;i++){
                if(!hm.containsKey(string.charAt(i))){
                    int []arr=new int[len];
                    arr[i]=1;
                    hm.put(string.charAt(i),arr);
                }
                else{
                    int []arr=hm.get(string.charAt(i));
                    arr[i]+=1;
                    hm.put(string.charAt(i),arr);
                }
            }
        }
        /*for (Map.Entry<Character,int[]> entry : hm.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + Arrays.toString(entry.getValue()));*/ 
        ArrayList<Map.Entry<Character, int[]>> list = new ArrayList<>(hm.entrySet());
        list.sort((a, b) -> {
            int index=0;
            while (index<a.getValue().length && a.getValue()[index]==b.getValue()[index]) {
                index++;
            }
            if(index>=a.getValue().length){
                return 0;
            }
            int x=a.getValue()[index];
            int y=b.getValue()[index];
            if(x<y){
                return 1;
            }
            return -1;
        });
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Character, int[]> entry : list) {
            sb.append(entry.getKey());
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String []votes={"ABC","ACB","ABC","ACB","ACB"};
        System.out.println((new RankByVotes1366Leet()).rankTeams(votes));
    }
}
