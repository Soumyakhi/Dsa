import java.util.HashMap;

public class CountLargestGroups139Leet {
    public int countLargestGroup(int n) {
        int maxSize[]={0};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=countSum(i);
            int size=hm.getOrDefault(sum,0)+1;
            hm.put(sum, size);
            maxSize[0]=Math.max(maxSize[0], size);
        }
        int count[]={0};
        hm.forEach((k,v)->{
            if(v==maxSize[0]){
                count[0]++;
            }
        });
        return count[0];
    }
    int countSum(int x){
        int sum=0;
        while (x!=0) {
            int rem=x%10;
            sum+=rem;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println((new CountLargestGroups139Leet()).countLargestGroup(13));
    }
}
