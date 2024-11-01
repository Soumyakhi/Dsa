import java.util.Arrays;
import java.util.HashMap;

public class RankTransform1331Leet {
    public int[] arrayRankTransform(int[] arr) {
        int []brr=arr.clone();
        Arrays.sort(brr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<brr.length;i++){
            if(!hm.containsKey(brr[i])){
                count++;
                hm.put(brr[i], count);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={40,10,20,30};
        int []res=(new RankTransform1331Leet()).arrayRankTransform(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
