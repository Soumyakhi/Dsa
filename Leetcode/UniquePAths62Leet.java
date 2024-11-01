import java.util.HashMap;

public class UniquePAths62Leet {
    public int uniquePaths(int m, int n) {
        return memorize(m, n, 0, 0,new HashMap<>());
    }
    int memorize(int m,int n,int i,int j,HashMap<String,Integer> hm){
        if(j==m || i==n){
            return 0;
        }
        if(j==m-1 && i==n-1){
            return 1;
        }
        String s=i+"+"+j;
        if(hm.containsKey(s)){
            return hm.get(s);
        }
        int res= memorize(m, n, i+1, j,hm)+memorize(m, n, i, j+1,hm);
        hm.put(s, res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println((new UniquePAths62Leet()).uniquePaths(3, 7));
    }
}

