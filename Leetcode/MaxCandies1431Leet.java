import java.util.ArrayList;

public class MaxCandies1431Leet {
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        //ArrayList<Boolean> list=new ArrayList<>();
        //int []candies={};
    }
}
