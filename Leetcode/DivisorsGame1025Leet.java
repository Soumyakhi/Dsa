import java.util.HashMap;

public class DivisorsGame1025Leet {
    public boolean divisorGame(int n) {
        return helper(n,new HashMap<>());
    }
    boolean helper(int x,HashMap<Integer,Boolean> hm){
        if(x<2){
            return false;
        }
        if(hm.containsKey(x)){
            return hm.get(x);
        }
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                if(!helper(x-i,hm)){
                    hm.put(x,true);
                    return true;
                }
            }
        }
        hm.put(x,false);
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new DivisorsGame1025Leet()).divisorGame(3));
    }
}
