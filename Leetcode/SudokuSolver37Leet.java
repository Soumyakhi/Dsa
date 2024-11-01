import java.util.Arrays;
public class SudokuSolver37Leet {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
    boolean helper(char[][]board,int row,int col){
        if(row==9){
            return true;
        }
        int nrow=0,ncol=0;
        if(col!=board.length-1){
            ncol=col+1;
            nrow=row;
        }
        else{
            ncol=0;
            nrow=row+1;
        }
        if(board[row][col]!='.'){
            return helper(board, nrow, ncol);
        }
        else{
            for(int i=1;i<10;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=Character.forDigit(i,10);
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                    else{
                        //backtrack
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    boolean isSafe(char[][] board, int row, int col, int numInt) {
        char num=Character.forDigit(numInt, 10);
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        int sr = (row / 3) * 3; 
        int sc = (col / 3) * 3; 
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
    
        return true;
    }
    public static void main(String[] args) {
        char[][]board={{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','9','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        (new SudokuSolver37Leet()).solveSudoku(board);
        for (char[] cs : board) {
            System.out.println(Arrays.toString(cs));
        }
    }
}
