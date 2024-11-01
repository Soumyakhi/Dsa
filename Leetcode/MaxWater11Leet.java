public class MaxWater11Leet {
    public int maxArea(int[] height) {
        int max=0;
        int start=0,finish=height.length-1;
        while (start<finish) {
            int area=(finish-start)*Math.min(height[start], height[finish]);
            max=Math.max(max, area);
            if(height[start]<=height[finish]){
                start++;
            }
            else{
                finish--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,4,8,3,7};
        MaxWater11Leet mx=new MaxWater11Leet();
        System.out.println(mx.maxArea(arr));
    }
}
