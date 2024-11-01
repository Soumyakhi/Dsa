public class ChessBoardSameColor3274Leet {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int sum1=coordinate1.charAt(0)+Character.getNumericValue(coordinate1.charAt(1));
        int sum2=coordinate2.charAt(0)+Character.getNumericValue(coordinate2.charAt(1));
        return (sum1+sum2)%2==0;
    }
    public static void main(String[] args) {
        System.out.println((new ChessBoardSameColor3274Leet()).checkTwoChessboards("a1", "c3"));
    }
}
