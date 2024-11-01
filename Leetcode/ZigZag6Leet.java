public class ZigZag6Leet {
    public String convert(String s, int numRows) {
        if(numRows<2){
            return s;
        }
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            int j=i;
            while (j < len) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int step = j + 2 * (numRows - 1)-2*i;
                    if (step < len) {
                        sb.append(s.charAt(step));
                    }
                }
                j += 2 * (numRows - 1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new ZigZag6Leet()).convert("PAYPALISHIRING", 3));
    }
}
