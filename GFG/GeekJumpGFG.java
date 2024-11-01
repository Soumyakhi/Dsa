public class GeekJumpGFG {
    int cache[];
    public int minimumEnergy(int arr[],int N){
        cache=new int[arr.length];
        return helper(arr, 0);
    }
    int helper(int arr[],int i){
        if(i==arr.length-1){
            return 0;
        }
        if(cache[i]!=0){
            return cache[i];
        }
        int oneStep=Integer.MAX_VALUE,twoStep=Integer.MAX_VALUE;
        if(i+1<arr.length){
            oneStep=Math.abs(arr[i]-arr[i+1])+helper(arr, i+1);
        }
        if(i+2<arr.length){
            twoStep=Math.abs(arr[i]-arr[i+2])+helper(arr, i+2);
        }
        int res=Math.min(oneStep,twoStep);
        cache[i]=res;
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new GeekJumpGFG()).minimumEnergy(new int[]{10,20,30,10}, 4));
    }
}