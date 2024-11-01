public class CheckXMatrix2319Leet {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i==n-(j+1)){
                    if(grid[i][j]==0){
                        return false;
                    }
                }
                else{
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][]grid={{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println((new CheckXMatrix2319Leet()).checkXMatrix(grid));
    }
}
