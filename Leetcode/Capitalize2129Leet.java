public class Capitalize2129Leet {
    public String capitalizeTitle(String title) {
        String []arr=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for (String string : arr) {
            if(string.length()<3){
                sb.append(string.toLowerCase()+" ");
            }
            else{
                String string1=Character.toUpperCase(string.charAt(0))+string.substring(1).toLowerCase();
                sb.append(string1+" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println((new Capitalize2129Leet()).capitalizeTitle("capiTalIze tHe titLe"));
    }
}
