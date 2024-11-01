public class ArrangingCoins441Leet {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while (left<=right) {
            long mid=(right+left)/2;
            long curr=mid*(mid+1)/2;
            if(curr==n){
                return (int)mid;
            }
            else if(curr<n){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return (int) right;
    }
    public static void main(String[] args) {
        System.out.println((new ArrangingCoins441Leet()).arrangeCoins(5));
    }
}
