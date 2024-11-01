import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reduce1338Leet{
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int size=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((a, b) -> {
            int val=(a.getValue()).compareTo(b.getValue())*-1;
            return val;
        });
        int count=0,sum=0;
        for (Map.Entry<Integer,Integer> entry : list) {
            count++;
            if(entry.getValue()+sum>=size){
                return count;
            }
            else{
                sum+=entry.getValue();
            }
        }
        return 4;
    }
    public static void main(String[] args) {
        int []arr={3,3,3,3,5,5,5,2,2,7};
        System.out.println((new Reduce1338Leet()).minSetSize(arr));
    }
}