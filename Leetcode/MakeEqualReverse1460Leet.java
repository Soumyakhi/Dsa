import java.util.HashMap;

public class MakeEqualReverse1460Leet {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer>hm1=new HashMap<>();
        for (int i : target) {
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i)+1);
            }
            else{
                hm1.put(i, 1);
            }
        }
        for (int i : arr) {
            if(hm1.containsKey(i) && hm1.get(i)>0){
                hm1.put(i, hm1.get(i)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int target[]={1,2,3,4};
        int arr[]={2,4,1,3};
        System.out.println((new MakeEqualReverse1460Leet()).canBeEqual(target, arr));
    }
}
