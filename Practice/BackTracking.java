import java.util.*;

public class BackTracking {
    static int countPath(int i, int j, int m, int n, int[][] arr) {
        if (i == m + 1 || j == n + 1 || i < 0 || j < 0) {
            return 0;
        }
        if (arr[i][j] == 1) {
            return 0;
        }
        if (i == m && j == n) {
            return 1;
        }

        arr[i][j] = 1;
        int left = countPath(i - 1, j, m, n, arr);
        int right = countPath(i + 1, j, m, n, arr);
        int up = countPath(i, j - 1, m, n, arr);
        int down = countPath(i, j + 1, m, n, arr);
        arr[i][j] = 0;
        return right + down + up + left;
    }
    static int countPathDeadMaze(int i, int j, int m, int n,int[][] maze) {
        if (i == m + 1 || j == n + 1 || i < 0 || j < 0) {
            return 0;
        }
        if(maze[i][j]==0){
            return 0;
        }
        if (maze[i][j] == -1) {
            return 0;
        }
        if (i == m && j == n) {
            return 1;
        }
        maze[i][j] = -1;
        int left = countPathDeadMaze(i - 1, j, m, n,maze);
        int right = countPathDeadMaze(i + 1, j, m, n,maze);
        int up = countPathDeadMaze(i, j - 1, m, n,maze);
        int down = countPathDeadMaze(i, j + 1, m, n,maze);
        maze[i][j] = 1;
        return right + down + up + left;
    }
    static void permute(String str,String permutation,ArrayList<String> list){
        if(str.length()==0){
            list.add(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            permute(newStr,permutation+currentChar,list);
        }
    }

    public static void main(String[] args) {
        System.out.println("Rat in a maze 4 directions");
        int[][] p = new int[3][3];
        System.out.println(countPath(0, 0, 2, 2, p));
        System.out.println("Rat in a Dead maze 4 directions");
        int[][] maze = { { 1, 0, 1, 1},
                { 1, 1, 1, 1},
                { 1, 1, 0, 1 } };
        System.out.println(countPathDeadMaze(0, 0, 2, 3,maze));
        System.out.println("Permutations of a String");
        ArrayList<String> list=new ArrayList<>();
        permute("abc", "", list);
        for (String strings : list) {
            System.out.println(strings);
        }

    }
}
