import java.util.LinkedList;
import java.util.Queue;

public class RotingOranges994Leet {
    static class Pair {
        int row,col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        } 
    }
    public int orangesRotting(int[][] grid) {
        int fresh=0;;
        Queue<Pair> qu=new LinkedList<>();
        int rows=grid.length,col=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    qu.add(new Pair(i, j));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        while (!qu.isEmpty()) {
            boolean hasRotten=false;
            int len=qu.size();
            for(int k=0;k<len;k++){
                Pair p=qu.poll();
                if(isValid(p.row+1, p.col, rows, col,grid)){
                    fresh--;
                    qu.add(new Pair(p.row+1, p.col));
                    grid[p.row+1][p.col]=2;
                    hasRotten=true;
                }
                if(isValid(p.row-1, p.col, rows, col,grid)){
                    fresh--;
                    qu.add(new Pair(p.row-1, p.col));
                    grid[p.row-1][p.col]=2;
                    hasRotten=true;
                }
                if(isValid(p.row, p.col+1, rows, col,grid)){
                    fresh--;
                    qu.add(new Pair(p.row, p.col+1));
                    grid[p.row][p.col+1]=2;
                    hasRotten=true;
                }
                if(isValid(p.row, p.col-1, rows, col,grid)){
                    fresh--;
                    qu.add(new Pair(p.row, p.col-1));
                    grid[p.row][p.col-1]=2;
                    hasRotten=true;
                }
            }
            if(hasRotten){
                time++;
            }
        }
        if(fresh!=0){
            return -1;
        }
        return time;
    }
    boolean isValid(int i,int j,int rows,int col,int[][] grid){
        if(i>=0 && i<rows && j>=0 && j<col && grid[i][j]==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][] arr={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println((new RotingOranges994Leet()).orangesRotting(arr));
    }
}
