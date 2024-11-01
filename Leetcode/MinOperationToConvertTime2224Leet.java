public class MinOperationToConvertTime2224Leet {
    public int convertTime(String current, String correct) {
        int count=0;
        int current1=Integer.parseInt(current.substring(0,2));
        int current2=Integer.parseInt(current.substring(3));
        int correct1=Integer.parseInt(correct.substring(0,2));
        int correct2=Integer.parseInt(correct.substring(3));
        int curr=(current1*60)+current2,corr=(correct1*60)+correct2;
        while (corr!=curr) {
            count++;
            if(curr+60<=corr){
                curr+=60;
            }
            else if(curr+15<=corr){
                curr+=15;
            }
            else if(curr+5<=corr){
                curr+=5;
            }
            else{
                curr+=1;
            }
            if(corr==curr){
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println((new MinOperationToConvertTime2224Leet()).convertTime("02:30", "04:35"));
    }
}
