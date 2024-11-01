import java.util.HashSet;

public class SetMismatch645Leet {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs1=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            hs1.add(i);
        }
        int arr[]=new int[2];
        HashSet<Integer> hs2=new HashSet<>();
        for (Integer integer : nums) {
            if(hs2.contains(integer)){
                arr[0]=integer;
            }
            else{
                hs2.add(integer);
            }
        }
        for (Integer integer : hs1) {
            if(!hs2.contains(integer)){
                arr[1]=integer;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,4};
        arr=((new SetMismatch645Leet()).findErrorNums(arr));
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
