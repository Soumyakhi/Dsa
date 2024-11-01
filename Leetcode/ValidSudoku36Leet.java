import java.util.HashSet;

public class ValidSudoku36Leet {
    public boolean isValidSudoku(char[][] board) {
        for (char[] cs : board) {
            HashSet<Character> hs = new HashSet<>();
            for (char chr : cs) {
                if (chr != '.') {
                    if (hs.contains(chr)) {
                        return false;
                    }
                    hs.add(chr);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            HashSet<Character> hs = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (hs.contains(board[j][i])) {
                        return false;
                    }
                    hs.add(board[j][i]);
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] != '.') {
                            if (boxSet.contains(board[i][j])) {
                                return false;
                            }
                            boxSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] arr = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println((new ValidSudoku36Leet()).isValidSudoku(arr));
    }
}