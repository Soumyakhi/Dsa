class MaxPointsCards1423Leet {
    public int maxScore(int[] cardPoints, int k) {
        int l=0,r=k-1;
        int sum=0,maxSum=0;
        for(int i=l;i<=r;i++){
            sum+=cardPoints[i];
        }
        maxSum=sum;
        int x=cardPoints.length-1;
        while (r>-1) {
            sum-=cardPoints[r];
            sum+=cardPoints[x];
            x-=1;
            r-=1;
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,1};
        System.out.println((new MaxPointsCards1423Leet()).maxScore(arr, 3));
    }
}