public class WordSearch79Leet {
    public boolean exist(char[][] board, String word) {
        int [][]isVisited=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backTrack(board, word, "", i, j, isVisited)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean backTrack(char[][] board, String word,String res,int i,int j,int [][]isVisited){
        if(i<0 || i>=board.length ||j<0 || j>=board[0].length){
            return false;
        }
        if(isVisited[i][j]==1){
            return false;
        }
        if(word.charAt(res.length())!=board[i][j]){
            return false;
        }
        res+=board[i][j];
        if(res.length()==word.length()){
            if(res.equals(word)){
                return true;
            }
            return false;
        }
        isVisited[i][j]=1;
        boolean up=backTrack(board, word, res, i-1, j, isVisited);
        boolean down=backTrack(board, word, res, i+1, j, isVisited);
        boolean right=backTrack(board, word, res, i, j+1, isVisited);
        boolean left=backTrack(board, word, res, i, j-1, isVisited);
        isVisited[i][j]=0;
        return up||down||right||left;
    }
    public static void main(String[] args) {
        char [][]arr={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println((new WordSearch79Leet()).exist(arr,"ABCCED"));
    }
}
