public class RangeSum2D304Leet {
    int arr[][];
    int prefixArr[][];
    public RangeSum2D304Leet(int[][] matrix) {
        arr=new int[matrix.length][matrix[0].length];
        arr=matrix;
        prefixArr=new int[matrix.length+1][matrix[0].length+1];
        for(int i=0;i<arr.length;i++){
            int prefix=0;
            for(int j=0;j<arr[0].length;j++){
                prefix+=arr[i][j];
                prefixArr[i+1][j+1]=prefix+prefixArr[i][j+1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        int bottomRight=prefixArr[row2][col2];
        int above=prefixArr[row1-1][col2];
        int left=prefixArr[row2][col1-1];
        int topLeft=prefixArr[row1-1][col1-1];
        return bottomRight-above-left+topLeft;
    }
}
