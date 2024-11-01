public class BuySellStocksii122Leet {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max=max+(prices[i]-prices[i-1]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BuySellStocksii122Leet bs=new BuySellStocksii122Leet();
        int []arr={2,1,2,1,0,1,2};
        System.out.println(bs.maxProfit(arr));
    }
}
