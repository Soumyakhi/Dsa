import java.util.HashMap;

public class CoinChangeII518Leet {
    public int change(int amount,int[] coins) {
        return memorize(coins, amount, new HashMap<>(),0);
    }
    int memorize(int coins[],int amount,HashMap<String,Integer> hm,int index){
        if(amount==0){
            return 1;
        }
        if(amount<0 || index==coins.length){
            return 0;
        }
        String key=amount+"-"+coins[index];
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int totalWays=memorize(coins, amount - coins[index], hm ,index)+memorize(coins, amount, hm ,index+1);
        hm.put(key, totalWays);
        return totalWays;
    }
    public static void main(String[] args) {
        int []coins={1,2,5};
        System.out.println((new CoinChangeII518Leet()).change(5, coins));
    }
}
