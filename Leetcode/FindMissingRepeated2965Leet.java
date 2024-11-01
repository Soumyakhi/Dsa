import java.util.HashMap;

public class FindMissingRepeated2965Leet {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int min=Integer.MAX_VALUE,count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                min=Math.min(grid[i][j],min);
                count++;
                if(hm.containsKey(grid[i][j])){
                    hm.put(grid[i][j], 2);
                }
                else{
                    hm.put(grid[i][j], 1);
                }
            }
        }
        int arr[]=new int[2];
        for(int i=1;i<=count;i++){
            if(!hm.containsKey(i)){
                arr[1]=i;
            }
            else if(hm.get(i)==2){
                arr[0]=i;
            }
        } 
        return arr;
    }
    public static void main(String[] args) {
        int [][]a={{1,3},{2,2}};
        int []res=(new FindMissingRepeated2965Leet()).findMissingAndRepeatedValues(a);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
