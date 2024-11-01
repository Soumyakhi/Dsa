import java.util.HashMap;

public class LemonadeChange86Leet {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]>5){
            return false;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(5, 0);
        hm.put(10, 0);
        for (int i : bills) {
            if(i==5){
                hm.put(5, hm.get(5)+1);
            }
            else if(i==10){
                if(!hm.containsKey(5) || hm.get(5)<1){
                    return false;
                }
                hm.put(5, hm.get(5)-1);
                hm.put(10, hm.get(10)+1);
            }
            else if(i==20){
                if(hm.get(5)<1 && hm.get(10)<1){
                    return false;
                }
                else if(hm.get(10)>=1 && hm.get(5)>=1){
                    hm.put(5, hm.get(5)-1);
                    hm.put(10, hm.get(10)-1);
                }
                else if(hm.get(5)>=3){
                    hm.put(5, hm.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5,10,20};
        System.out.println((new LemonadeChange86Leet()).lemonadeChange(arr));
    }
}
