public class DeleteToMakeFancy1957Leet {
    public String makeFancyString(String s) {
        char frecChar='1';
        int freq=0;
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray()) {
            if(frecChar==c){
                freq++;
                if(freq==3){
                    freq=2;
                }
                else{
                    sb.append(c);
                }
            }
            else{
                frecChar=c;
                freq=1;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new DeleteToMakeFancy1957Leet()).makeFancyString("leeetcode"));
    }
}
