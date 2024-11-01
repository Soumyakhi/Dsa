public class LicenseFormatting482Leet {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","");
        StringBuilder sb=new StringBuilder(s).reverse();
        StringBuilder sb2=new StringBuilder();
        int dash=0;
        for(int i=0;i<sb.length();i++){
            if(dash!=k){
                sb2.append(Character.toUpperCase(sb.charAt(i)));
                dash++;
            }
            else{
                sb2.append("-"+Character.toUpperCase(sb.charAt(i)));
                dash=1;
            }
        }
        return sb2.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println((new LicenseFormatting482Leet()).licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}
