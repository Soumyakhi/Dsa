import java.util.ArrayList;

public class SelfDividingNums728Leet {
    public ArrayList<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = left; i < right + 1; i++) {
            int x = i, r,divs=1;
            while (x != 0) {
                r = x % 10;
                if (r == 0) {
                    divs=0;
                    break;
                }
                if ((i % r) != 0) {
                    divs=0;
                    break;
                }
                x = x / 10;
            }
            if(divs==1){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        SelfDividingNums728Leet sf = new SelfDividingNums728Leet();
        System.out.println(sf.selfDividingNumbers(1,22));
    }
}
