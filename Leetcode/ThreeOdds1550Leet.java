public class ThreeOdds1550Leet {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,2,34,3,4,5,7,23,12};
        ThreeOdds1550Leet th=new ThreeOdds1550Leet();
        System.out.println(th.threeConsecutiveOdds(arr));
    }
}