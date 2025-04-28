import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PivotInteger2485Leet {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        for (int i=1;i<=n;i++) {
            if(checkPivot(i, n)){
                return i;
            }
        }
        return -1;
    }
    boolean checkPivot(int i,int n){
        return ((i*(i+1)/2)==((n*(n+1)/2)-((i-1)*(i)/2)));
    }
    public static void main(String[] args) {

        System.out.println((new PivotInteger2485Leet()).pivotInteger(3));
    }
}
