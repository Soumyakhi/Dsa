import java.util.HashMap;

public class BuySellStocksCooldown309Leet {
    private HashMap<String, Integer> hm = new HashMap<>();
    public int maxProfit(int[] prices) {
        return dfs(prices, 0, 0,0);
    } 
    private int dfs(int[] prices, int index, int hasStock, int sold) {
        if (index >= prices.length) {
            return 0;
        }
        String key = index + "," + hasStock + "," + sold;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        int res = 0;
        if (sold == 1) {
            res = dfs(prices, index + 1, 0, 0);
        } else if (hasStock == 1) {
            int sell = prices[index] + dfs(prices, index + 1, 0, 1); 
            int hold = dfs(prices, index + 1, 1, 0); 
            res = Math.max(sell, hold);
        } else {
            int buy = -prices[index] + dfs(prices, index + 1, 1, 0); 
            int hold = dfs(prices, index + 1, 0, 0); 
            res = Math.max(buy, hold);
        }

        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        System.out.println((new BuySellStocksCooldown309Leet()).maxProfit(arr));
    }
}
