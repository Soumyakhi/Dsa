public class MaxAverage643Leet {
    /*public double findMaxAverage(int[] nums, int k) {
        if(k==0){
            return 0;
        }
        if(nums.length==1){
            return (double)nums[0]/k;
        }
        float []arr=new float[nums.length-k+1];
        int count=nums.length-k+1;
        int index=0;
        while (count !=0 && index<nums.length) {
            int sum=0;
            for(int i=index;i<index+k;i++){
                sum+=nums[i];
            }
            arr[index]=(float)sum/k;
            count--;
            index++;   
        }
        float max=0;
        for (float f : arr) {
            if(f>max){
                max=f;
            }
        }
        return max;
    }*/
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double avg=(double)sum/k;
        double maxAvg=avg;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            avg=(double)sum/k;
            maxAvg=Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        MaxAverage643Leet ma=new MaxAverage643Leet();
        int []arr={1,12,-5,-6,50,3};
        System.out.println(ma.findMaxAverage(arr, 4));
    }
}
