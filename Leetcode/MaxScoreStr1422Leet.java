public class MaxScoreStr1422Leet {
    public int maxScore(String s) {
        int length = s.length();
        char ch[]=s.toCharArray();
        int count0=0,count1=0,sum=0;
        for(int i=0;i<length;i++){
            if(ch[i]=='1'){
                count1++;
            }
        }
        for(int i=0;i<length-1;i++){
            if(ch[i]=='0'){
                count0++;
            }
            else{
                count1--;
            }
            sum=Math.max(sum, count0+count1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println((new MaxScoreStr1422Leet()).maxScore("011101"));
    }
}
