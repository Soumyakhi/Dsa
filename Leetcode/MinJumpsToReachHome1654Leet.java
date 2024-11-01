import java.util.HashMap;
import java.util.HashSet;
public class MinJumpsToReachHome1654Leet {
    int upperBound;
    HashSet<Integer> forbn=new HashSet<>();
    HashMap<String,Integer> hm=new HashMap<>();
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int max=0;
        for(int i=0;i<forbidden.length;i++){
            forbn.add(forbidden[i]);
            max=Math.max(max, forbidden[i]);
        }
        this.upperBound=Math.max(x+b,max+a+b);
        int res=minMoves(0, a, b, x,0);
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    int minMoves(int currIndex,int a,int b,int x,int cameBackwards){
        if(currIndex==x){
            return 0;
        }
        if (currIndex < 0 || currIndex>upperBound || forbn.contains(currIndex)) {
            return Integer.MAX_VALUE;
        }
        String key=currIndex+","+cameBackwards;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int res=Integer.MAX_VALUE;
        //forward
        forbn.add(currIndex);
        int forward=minMoves(currIndex+a, a, b, x,0);
        if(forward!=Integer.MAX_VALUE){
            res=Math.min(forward+1,res);
        }
        //backwards
        if(cameBackwards==0){
            int backwards=minMoves(currIndex-b, a, b, x,1);
            if(backwards!=Integer.MAX_VALUE){
                res=Math.min(backwards+1,res);
            }
        }
        forbn.remove(currIndex);
        hm.put(key,res);
        return res;
    }
    public static void main(String[] args) {
        int []nums={};
        System.out.println((new MinJumpsToReachHome1654Leet()).minimumJumps(nums, 11, 5, 100));
    }
}
