import java.util.HashSet;

public class CheckAllNumbers2133Leet {
    public boolean checkValid(int[][] matrix) {
        for (int[] is : matrix) {
            HashSet<Integer> hs=new HashSet<>();
            for (int num : is) {
                hs.add(num);
            }
            for(int i=1;i<=matrix[0].length;i++){
                if(!hs.contains(i)){
                    return false;
                }
            }
        }
        for (int i=0;i<matrix.length;i++) {
            HashSet<Integer> hs=new HashSet<>();
            for (int j=0;j<matrix[0].length;j++) {
                hs.add(matrix[j][i]);
            }
            for(int k=1;k<=matrix[0].length;k++){
                if(!hs.contains(k)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,1,2},{2,3,1}};
        System.out.println((new CheckAllNumbers2133Leet()).checkValid(arr));
    }
}
