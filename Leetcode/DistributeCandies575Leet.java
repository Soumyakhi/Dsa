import java.util.HashSet;

public class DistributeCandies575Leet {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<candyType.length;i++) {
            hs.add(candyType[i]);
        }
        if(hs.size()<candyType.length/2){
            return hs.size();
        }
        return candyType.length/2;
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,3};
        System.out.println((new DistributeCandies575Leet()).distributeCandies(arr));
    }
}