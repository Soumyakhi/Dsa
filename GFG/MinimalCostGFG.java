import java.util.Arrays;

public class MinimalCostGFG {
    int cache[];
    public int minimizeCost(int k, int arr[]){
        cache=new int[arr.length];
        Arrays.fill(cache, -1);
        return helper(arr, 0,k);
    }
    int helper(int arr[],int i,int k){
        if(i==arr.length-1){
            return 0;
        }
        if(cache[i]!=-1){
            return cache[i];
        }
        int res=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if((i+j)>=arr.length){
                break;
            }
            int remainingCost =helper(arr, i+j,k);
            if(remainingCost !=Integer.MAX_VALUE){
                res=Math.min(res, Math.abs(arr[i]-arr[i+j])+remainingCost );
            }
        }
        cache[i] = res;
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new MinimalCostGFG()).minimizeCost(3,new int[]{10, 30, 40, 50, 20}));
    }
}
