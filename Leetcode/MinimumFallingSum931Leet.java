import java.util.Arrays;

public class MinimumFallingSum931Leet {
    int [][]cache;
    public int minFallingPathSum(int[][] matrix) {
        cache=new int[matrix.length][matrix[0].length];
        for(int i=0;i<cache.length;i++){
            Arrays.fill(cache[i], Integer.MIN_VALUE);
        }
        int res=Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++){
            res=Math.min(res, matrix[0][j]+helper(0, j,matrix));
        }
        return res;
    }
    int helper(int prevIndexi,int prevIndexj,int [][]matrix){
        if(prevIndexi>=matrix.length-1){
            return 0;
        }
        if(cache[prevIndexi][prevIndexj]!=Integer.MIN_VALUE){
            return cache[prevIndexi][prevIndexj];
        }
        int diaLeft=Integer.MAX_VALUE,diaRight=Integer.MAX_VALUE;
        if(prevIndexj!=0){
            diaLeft=matrix[prevIndexi+1][prevIndexj-1]+helper(prevIndexi+1, prevIndexj-1, matrix);
        }
        if(prevIndexj!=matrix[0].length-1){
            diaRight=matrix[prevIndexi+1][prevIndexj+1]+helper(prevIndexi+1, prevIndexj+1, matrix);
        }
        int bottom=matrix[prevIndexi+1][prevIndexj]+helper(prevIndexi+1, prevIndexj, matrix);
        int res=Math.min(Math.min(diaRight, diaLeft),bottom);
        cache[prevIndexi][prevIndexj]=res;
        return res;
    }
    public static void main(String[] args) {
        int arr[][]={{2,1,3},{6,5,4},{7,8,9}};
        System.out.println((new MinimumFallingSum931Leet()).minFallingPathSum(arr));
    }
}
