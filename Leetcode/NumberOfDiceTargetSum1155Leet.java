import java.util.HashMap;

public class NumberOfDiceTargetSum1155Leet {
    private static final int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        return helper(0, n, target, k,new HashMap<>());
    }
    int helper(int diceNo,int n,int target,int k,HashMap<String,Integer> hm){
        if(target<0){
            return 0;
        }
        if(diceNo==n){
            if(target==0){
                return 1;
            }
            return 0;
        }
        String key=diceNo+","+target;
        if (hm.containsKey(key)) return hm.get(key);
        int totalWays=0;
        for(int i=1;i<=k;i++){
            totalWays=(totalWays+helper(diceNo+1, n, target-i, k,hm))%MOD;
        }
        hm.put(key, totalWays);
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println((new NumberOfDiceTargetSum1155Leet()).numRollsToTarget(1, 6, 3));
    }
}
