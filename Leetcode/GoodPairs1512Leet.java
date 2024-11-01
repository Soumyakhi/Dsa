import java.util.HashMap;

public class GoodPairs1512Leet {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : nums) {
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int[] sum = {0};
        hm.forEach( (k, v) -> { 
            if(v>1){
                sum[0]+=combinations(v);
            } } );
        return sum[0];
    }
    int combinations(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        int arr[]={6,5,1,5,7,7,9,1,5,7,1,6,10,9,7,4,1,
            8,7,1,1,8,6,4,7,4,10,5,3,
            9,10,1,9,5,5,4,1,7,4,2,9,2,6,6,4,2,10,3,5,3,6,4,7,4
            ,6,4,4,6,3,4,10,1,10,6,10,4,9,6,6,4,8,6,9,5,4};
        GoodPairs1512Leet gp=new GoodPairs1512Leet();
        System.out.println(gp.numIdenticalPairs(arr));
    }
}
