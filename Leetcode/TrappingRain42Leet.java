public class TrappingRain42Leet {
    /*public int trap(int[] height) {
        int prefixMax[]=new int[height.length];
        int suffixMax[]=new int[height.length];
        prefixMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            prefixMax[i]=Math.max(height[i], prefixMax[i-1]);
        }
        suffixMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>-1;i--){
            suffixMax[i]=Math.max(height[i], suffixMax[i+1]);
        }
        int totalWater=0;
        for(int i=1;i<height.length;i++){
            totalWater+=Math.min(prefixMax[i], suffixMax[i])-height[i];
        }
        return totalWater;
    }*/
    public int trap(int[] height) {
        int lmax=0,rmax=0,l=0,r=height.length-1,total=0;
        while (l<r) {
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    total+=lmax-height[l];
                }
                else{
                    lmax=height[l];
                }
                l++;
            }
            else{
                if(rmax>height[r]){
                    total+=rmax-height[r];
                }
                else{
                    rmax=height[r];
                }
                r--;
            }
        }
        return total;
    }
}
