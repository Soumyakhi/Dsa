import java.util.ArrayList;

public class MatchingRule1773Leet {
    public int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for (ArrayList<String> item : items) {
            if(ruleKey.equals("type")){
                if((item.get(0)).equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey.equals("color")){
                if((item.get(1)).equals(ruleValue)){
                    count++;
                }
            }
            else if(ruleKey.equals("name")){
                if((item.get(2)).equals(ruleValue)){
                    count++;
                }
            }
        }
        System.gc();
        return count;
    }
}
