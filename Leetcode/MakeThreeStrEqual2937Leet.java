public class MakeThreeStrEqual2937Leet {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLen=Math.min(Math.min(s1.length(), s2.length()),s3.length());
        int count=0;
        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i)==s3.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        if(count==0){
            return -1;
        }
        int res=(s1.length()-count)+(s2.length()-count)+(s3.length()-count);
        return res;
    }
    public static void main(String[] args) {
        String s1="zbc",s2="nbb",s3="abc";
        System.out.println((new MakeThreeStrEqual2937Leet()).findMinimumOperations(s1, s2, s3));
    }
}
