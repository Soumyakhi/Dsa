public class ThreeDivisior1952Leet {
    public boolean isThree(int n) {
        if(n<4){
            return false;
        }
        int count=0;
        for(int i=1;i<(n/2)+1;i++){
            if(n%i==0){
                count++;
            }
        }
        count++;
        if(count==3){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ThreeDivisior1952Leet td=new ThreeDivisior1952Leet();
        System.out.println(td.isThree(7));
    }
}
