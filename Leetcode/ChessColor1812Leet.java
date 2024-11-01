public class ChessColor1812Leet {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        String b=coordinates.substring(1);
        if((Character.getNumericValue(a)+Integer.parseInt(b))%2==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((new ChessColor1812Leet()).squareIsWhite("a1"));
    }
}
