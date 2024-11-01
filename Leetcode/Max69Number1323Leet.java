public class Max69Number1323Leet {
    public int maximum69Number (int num) {
        char []s=Integer.toString(num).toCharArray();
        boolean applied=false;
        StringBuilder sb=new StringBuilder();
        for (char c : s) {
            if(c=='6' && !applied){
                sb.append(9);
                applied=true;
            }
            else{
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        System.out.println((new Max69Number1323Leet()).maximum69Number(9669));
    }
}
