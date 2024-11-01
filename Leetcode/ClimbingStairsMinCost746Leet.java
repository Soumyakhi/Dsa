import java.util.HashMap;

public class ClimbingStairsMinCost746Leet {
    public int minCostClimbingStairs(int[] cost) {
        return helper(-1, 0, cost, new HashMap<>());
    }
    int helper(int index, int sum, int[] cost, HashMap<Integer, Integer> hm) {
        if (index >= cost.length) {
            return sum;
        }
        if (hm.containsKey(index)) {
            return hm.get(index) + sum + cost[index];
        }
    
        if (index != -1) {
            sum += cost[index];
        }
    
        int res = Math.min(helper(index + 1, sum, cost, hm), helper(index + 2, sum, cost, hm));
        hm.put(index, res - sum);
    
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println((new ClimbingStairsMinCost746Leet())
            .minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}
