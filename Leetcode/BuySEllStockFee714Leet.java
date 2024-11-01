import java.util.HashMap;

public class BuySEllStockFee714Leet {
    private HashMap<String, Integer> hm = new HashMap<>();
    int fee;
    public int maxProfit(int[] prices, int fee) {
        this.fee=fee;
        return dfs(prices, 0, 0);
    }
    private int dfs(int[] prices, int index, int hasStock) {
        if (index >= prices.length) {
            return 0;
        }
        String key = index + "," + hasStock;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        int res = 0;
        if (hasStock == 1) {
            int sell = prices[index]-fee + dfs(prices, index + 1, 0); 
            int hold = dfs(prices, index + 1, 1); 
            res = Math.max(sell, hold);
        } else {
            int buy = -prices[index] + dfs(prices, index + 1, 1); 
            int hold = dfs(prices, index + 1, 0); 
            res = Math.max(buy, hold);
        }
        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,8,4,9};
        System.out.println((new BuySEllStockFee714Leet()).maxProfit(arr,2));
    }
}
