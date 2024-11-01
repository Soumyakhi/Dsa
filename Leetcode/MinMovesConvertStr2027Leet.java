public class MinMovesConvertStr2027Leet {
    public int minimumMoves(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 'X') {
                count++;
                i += 2;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println((new MinMovesConvertStr2027Leet()).minimumMoves("XXX"));
    }
}