import java.util.HashMap;

public class CoinChange322Leet {
    public int coinChange(int[] coins, int amount) {
        int res= memorize(coins, amount, 0, new HashMap<>());
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    private int memorize(int[] coins, int amount, int index, HashMap<String, Integer> memo) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0 || index == coins.length) {
            return Integer.MAX_VALUE;
        }
        String key = amount + "-" + index;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int way1 = memorize(coins, amount - coins[index], index, memo);
        if (way1 != Integer.MAX_VALUE) {
            way1 += 1;
        }
        int way2 = memorize(coins, amount, index + 1, memo);
        int minWays = Math.min(way1, way2);
        memo.put(key, minWays);
        return minWays;
    }

    public static void main(String[] args) {
        int coins[]={1,2,5};
        System.out.println((new CoinChange322Leet()).coinChange(coins, 11));
    }
}
