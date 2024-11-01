public class MatrixDiagonalSum1572Leet {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1){
            return mat[0][0];
        }
        int leftSum=0,rightSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){ 
                    leftSum+=mat[i][j];
                }
                if(i==(mat.length-1)-j){
                    rightSum+=mat[i][j];
                }
            }
        }
        int res=leftSum+rightSum;
        if(mat.length%2==1){
            res-=mat[(mat.length/2)][(mat.length/2)];
        }
        return res;
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
            {4,5,6},
            {7,8,9}};
        System.out.println((new MatrixDiagonalSum1572Leet()).diagonalSum(arr));
    }
}
