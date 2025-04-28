public class CellsOddVal1252Leet{
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(j==row){
                        arr[j][k]++;
                    }
                }
            }
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(k==col){
                        arr[j][k]++;
                    }
                }
            }
        }
        int oddCount=0;
        for(int j=0;j<m;j++){
            for(int k=0;k<n;k++){
                if(arr[j][k]%2==1){
                    oddCount++;
                }
            }
        }
        return oddCount;
    }
    public static void main(String[] args) {
        System.out.println((new CellsOddVal1252Leet()).oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }
}