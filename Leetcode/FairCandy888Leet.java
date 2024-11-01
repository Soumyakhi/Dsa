import java.lang.reflect.Array;
import java.util.Arrays;

public class FairCandy888Leet {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0,bobTotal=0;
        for (int i : aliceSizes) {
            aliceTotal+=i;
        }
        for (int i : bobSizes) {
            bobTotal+=i;
        }
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        for (int i : aliceSizes) {
            for (int j : bobSizes) {
                int temp1=aliceTotal,temp2=bobTotal;
                int alicGives=i,bobGives=j;
                temp1+=j;
                temp1-=i;
                temp2+=i;
                temp2-=j;
                if(temp1==temp2){
                    return new int[]{alicGives,bobGives};
                }
            }
        }
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int []alice={1,1};
        int []bob={2,2};
        int []res=((new FairCandy888Leet()).fairCandySwap(alice, bob));
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
