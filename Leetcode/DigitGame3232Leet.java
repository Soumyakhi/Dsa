public class DigitGame3232Leet {
    public boolean canAliceWin(int[] nums) {
        int dou=0,sin=0;
        for (int i : nums) {
            if(i>9){
                dou+=i;
            }
            else{
                sin+=i;
            }
        }
        return (dou!=sin);
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,10};
        System.out.println((new DigitGame3232Leet()).canAliceWin(nums));
    }
}
