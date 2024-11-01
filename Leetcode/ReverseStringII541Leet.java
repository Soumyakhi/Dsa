public class ReverseStringII541Leet {
    public String reverseStr(String s, int k) {
        int slow=0,fast=1;
        StringBuilder sb=new StringBuilder();
        while(fast<s.length()){
            if((fast-slow)+1==2*k){
                StringBuilder sb1=new StringBuilder(s.substring(slow,slow+k));
                sb1.reverse();
                sb.append(sb1);
                sb.append(s.substring(slow+k, fast+1));
                slow=++fast;
                fast++;
            }
            else{
                fast++;
            }
        }
        if(s.length()!=slow){
            if(s.length()-slow<k){
                StringBuilder sb1=new StringBuilder(s.substring(slow, s.length()));
                sb.append(sb1.reverse());
                
            }
            else if(s.length()-slow<2*k){
                StringBuilder sb1=new StringBuilder(s.substring(slow,(slow+k)));
                System.out.println(sb1);
                sb1.reverse();
                sb.append(sb1);
                sb.append(s.substring((slow+k), s.length()));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new ReverseStringII541Leet()).reverseStr("abcd",3));
    }
}
