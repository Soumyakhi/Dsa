import java.util.HashMap;
import java.util.Map;

public class FruitBaskets904Leet {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> fruitMap=new HashMap<>();
        int left=0,max=1;
        fruitMap.put(fruits[0], 1);
        for(int i=1;i<fruits.length;i++){
            fruitMap.put(fruits[i], fruitMap.getOrDefault(fruits[i],0)+1);
            if(fruitMap.size()>2){
                fruitMap.put(fruits[left], fruitMap.get(fruits[left])-1);
                if(fruitMap.get(fruits[left])==0){
                    fruitMap.remove(fruits[left]);
                }
                left++;
            }
            max=Math.max(max, i-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        System.out.println((new FruitBaskets904Leet()).totalFruit(arr));
    }
}
