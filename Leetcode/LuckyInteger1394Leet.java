import java.util.HashMap;

public class LuckyInteger1394Leet {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        int found[]={-1};
        hm.forEach((k,v)->{
            if(k==v){
                found[0]=k;
                return;
            }
        });
        return found[0];
    }
    public static void main(String[] args) {
        System.out.println((new LuckyInteger1394Leet()).findLucky(new int[]{2,2,2,3,3}));
    }
}
