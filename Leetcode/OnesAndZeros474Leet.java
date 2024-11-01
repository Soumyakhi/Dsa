import java.util.HashMap;

public class OnesAndZeros474Leet {
    public int findMaxForm(String[] strs, int m, int n) {
        int arr[][]=new int[strs.length][2];
        for(int i=0;i<strs.length;i++){
            int sum0=0,sum1=0;
            for (char chr : strs[i].toCharArray()) {
                if(chr=='0'){
                    sum0++;
                }
                else{
                    sum1++;
                }
                arr[i][0]=sum0;
                arr[i][1]=sum1;
            }
        }
        return helper(0, arr, m, n,new HashMap<>());
    }
    int helper(int index,int [][] arr,int m,int n,HashMap<String,Integer>hm){
        if(m<0 || n<0){
            return Integer.MIN_VALUE;
        }
        if(index>=arr.length){
            return 0;
        }
        String key=index+","+m+','+n;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int include=1+helper(index+1, arr, m-arr[index][0], n-arr[index][1],hm);
        int exclude=helper(index+1, arr, m, n,hm);
        int res=Math.max(include, exclude);
        hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        String str[]= {"10","0001","111001","1","0"};
        System.out.println((new OnesAndZeros474Leet()).findMaxForm(str, 5, 3));
    }
}
