public class BuyTwoChocolates2706Leet {
    /*public int buyChoco(int[] prices, int money) {
        int left=money;
        Arrays.sort(prices);
        left-=prices[0];
        left-=prices[1];
        if(left>-1){
            return left;
        }
        return money;
    }*/
    /*public int buyChoco(int[] prices, int money) {
        int left=money;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<prices.length;i++){
            pq.offer(prices[i]);
        }
        left-=pq.poll();
        left-=pq.peek();
        if(left>-1){
            return left;
        }
        return money;
    }*/
    public int buyChoco(int[] prices, int money) {
        int left=money;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int minIndex=0;
        for(int i=0;i<prices.length;i++){
            min1=Math.min(min1, prices[i]);
            if(prices[i]==min1){
                minIndex=i;
            }
        }
        for(int i=0;i<prices.length;i++){
            if(i!=minIndex){
                min2=Math.min(min2, prices[i]);
            }
        }
        left-=min1;
        left-=min2;
        if(left>-1){
            return left;
        }
        return money;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2};
        System.out.println((new BuyTwoChocolates2706Leet()).buyChoco(arr, 3));
    }
}
