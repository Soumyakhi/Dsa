public class GenerateOddCounts1374Leet {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        if(n%2==0){
            sb.append("a".repeat(n-1));
            sb.append("b");
            return sb.toString();
        }
        return "a".repeat(n);
    }
    public static void main(String[] args) {
        System.out.println((new GenerateOddCounts1374Leet()).generateTheString(2));
    }
}
