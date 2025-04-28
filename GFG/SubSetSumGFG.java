import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class SubSetSumGFG {
    static Boolean isSubsetSum(int arr[], int sum) {
        int cache[][]=new int[arr.length][sum+1];
        for(int i=0;i<cache.length;i++){
            Arrays.fill(cache[i], -1);
        }
        return helper(arr, sum, 0, cache);
    }
    static boolean helper(int arr[], int currSum,int index,
    int[][] cache) {
        if(currSum==0){
            return true;
        }
        if(index==arr.length || currSum<0){
            return false;
        }
        if(cache[index][currSum]!=-1){
            if(cache[index][currSum]==0){
                return false;
            }
            return true;
        }
        boolean include=helper(arr, currSum-arr[index], index+1, cache);
        boolean exclude=helper(arr, currSum, index+1, cache);
        boolean res=include||exclude;
        if(res==true){
            cache[index][currSum]=1;
        }
        else{
            cache[index][currSum]=0;
        }
        return res;
    }
}
