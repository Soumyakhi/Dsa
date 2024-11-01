public class CanPlaceFlowers605Leet {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(n>1){
                return false;
            }
            else{
                if(flowerbed[0]==1){
                    return false;
                }
                return true;
            }
        }
        int count=n;
        while(count!=0){
            for(int i=0;i<flowerbed.length;i++){
                if(i==0){
                    if(flowerbed[i]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                        
                    }
                }
                else if(i==flowerbed.length-1){
                    if(flowerbed[i]==0 && flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else{
                    if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
            count--;
        }
        if(n<=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={0,0,1,0,0};
        CanPlaceFlowers605Leet cf=new CanPlaceFlowers605Leet();
        System.out.println(cf.canPlaceFlowers(arr, 1));
    }
}

