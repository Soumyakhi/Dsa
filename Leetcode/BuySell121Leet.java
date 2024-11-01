public class BuySell121Leet {
    /*public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                al.add(prices[j]-prices[i]);
            }
        }
        Collections.sort(al);
        if(al.get(al.size()-1)<0){
            return 0;
        }
        return al.get(al.size()-1);
    }*/
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int left=0;
        int right=1,max=0;
        while(right<=(prices.length-1)){
            if(prices[left]>prices[right]){
                left=right;
                right++;
            }
            else{
                if(max<prices[right]-prices[left]){
                    max=prices[right]-prices[left];
                }
                right++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BuySell121Leet bs=new BuySell121Leet();
        int []arr={2,1,2,1,0,1,2};
        System.out.println(bs.maxProfit(arr));
    }
}
