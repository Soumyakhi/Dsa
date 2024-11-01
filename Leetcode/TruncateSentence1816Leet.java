public class TruncateSentence1816Leet {
    public String truncateSentence(String s, int k) {
        if(k>=s.length()){
            return "";
        }
        int count=0;
        String []sarr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sarr.length;i++){
            if(count>=k){
                return (sb.toString()).trim();
            }
            if(i==sarr.length-1){
                sb.append(sarr[i]);
            }
            else{
                sb.append(sarr[i]+" ");
            }
            count++;
        }
        return (sb.toString()).trim();
    }
    public static void main(String[] args) {
        TruncateSentence1816Leet tr=new TruncateSentence1816Leet();
        System.out.println(tr.truncateSentence("Hello how are you Contestant", 4));
    }
}
