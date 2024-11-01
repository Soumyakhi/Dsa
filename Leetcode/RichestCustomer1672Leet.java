public class RichestCustomer1672Leet {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] ith : accounts) {
            int sum=0;
            for (int am : ith) {
                sum+=am;
            }
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{3,2,1}};
        RichestCustomer1672Leet rc=new RichestCustomer1672Leet();
        System.out.println(rc.maximumWealth(a));
    }
}
