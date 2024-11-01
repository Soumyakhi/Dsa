import java.util.HashMap;

public class ClosestDessertCost1774Leet {
    HashMap<String,Integer> hm=new HashMap<>();
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int closestCost = Integer.MAX_VALUE;
        for (int baseCost : baseCosts) {
            int result = helper(0, toppingCosts, target, baseCost);
            if (Math.abs(target - result) < Math.abs(target - closestCost)) {
                closestCost = result;
            } else if (Math.abs(target - result) == Math.abs(target - closestCost)) {
                closestCost = Math.min(closestCost, result);
            }
        }
        return closestCost;
    }
    int helper(int index,int toppingCosts[],int target,int cost){
        if(index==toppingCosts.length){
            return cost;
        }
        String key=index+","+cost;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        //Skip
        int skip=helper(index+1, toppingCosts, target,  cost);
        //Add Once
        int once=helper(index+1, toppingCosts, target,  cost+toppingCosts[index]);
        //Add Twice
        int twice=helper(index+1, toppingCosts, target,cost+toppingCosts[index]+toppingCosts[index]);
        int bestCost = findClosest(target, skip, once, twice);
        hm.put(key, bestCost);
        return bestCost;
    }
    int findClosest(int target, int cost1, int cost2, int cost3) {
        int bestCost = cost1;
        if (Math.abs(target - cost2) < Math.abs(target - bestCost) || (Math.abs(target - cost2) == Math.abs(target - bestCost) && cost2 < bestCost)) {
            bestCost = cost2;
        }
        if (Math.abs(target - cost3) < Math.abs(target - bestCost) || (Math.abs(target - cost3) == Math.abs(target - bestCost) && cost3 < bestCost)) {
            bestCost = cost3;
        }
        return bestCost;
    }
    public static void main(String[] args) {
        int baseCost[]={1,7};
        int toppingCost[]={3,4};
        System.out.println((new ClosestDessertCost1774Leet()).closestCost(baseCost, toppingCost, 10));
    }
}
