public class CountSubString3084Leet {
    public long countSubstrings(String s, char c) {
        char[] arr=s.toCharArray();
        long count=0;
        for (char chr : arr) {
            if(chr==c){
                count++;
            }
        }
        long sum=count*(count+1)/2;
        
        return sum;
    }
    public static void main(String[] args) {
        CountSubString3084Leet cs=new CountSubString3084Leet();
        System.out.println(cs.countSubstrings("abada", 'a'));
    }
}
