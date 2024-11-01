public class SumOfSqNumbers633Leet {
    public boolean judgeSquareSum(int c) {
        if(c<3){
            return true;
        }
        long first=0,last=Math.round(Math.sqrt(c));
        while(first<last){
            if((first*first)+(first*first)==c){
                return true;
            }
            else if((last*last)+(last*last)==c){
                return true;
            }
            else if((first*first)+(last*last)==c){
                return true;
            }
            else if((first*first)+(last*last)>c){
                last--;
            }
            else{
                first ++;
            }
        }
        return false;   
    }
    public static void main(String[] args) {
        System.out.println((new SumOfSqNumbers633Leet()).judgeSquareSum(100000));
    }
}
