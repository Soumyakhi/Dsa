import java.util.ArrayList;
import java.util.List;
public class MinDominoRotation1007Leet {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        List<Integer> possibleList=new ArrayList<>();
        for(int i=1;i<=6;i++){
            boolean flag=true;
            for(int j=0;j<tops.length;j++){
                if(tops[j]!= i && bottoms[j]!=i){
                    flag=false;
                    break;
                }
            }
            if(flag){
                possibleList.add(i);
            }
        }
        if(possibleList.isEmpty()){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for (Integer integer : possibleList) {
            int minOpp=Math.min(topOpp(tops, integer),bottomOpp(bottoms, integer));
            min=Math.min(minOpp, min);
        }
        return min;
    }
    int topOpp(int []tops,int element){
        int opp=0;
        for (int i : tops) {
            if(element!=i){
                opp++;
            }
        }
        return opp;
    }
    int bottomOpp(int []bottoms,int element){
        int opp=0;
        for (int i : bottoms) {
            if(element!=i){
                opp++;
            }
        }
        return opp;
    }
    public static void main(String[] args) {
        int []tops={2,1,2,4,2,2};
        int []bottoms={5,2,6,2,3,2};
        System.out.println((new MinDominoRotation1007Leet()).minDominoRotations(tops, bottoms));
    }
    /*public int minDominoRotations(int[] tops, int[] bottoms) {
        //List<Integer> possibleList=new ArrayList<>();
        boolean flagEmpty=true;
        int []possibleArr=new int[6];
        for(int i=1;i<=6;i++){
            boolean flag=true;
            for(int j=0;j<tops.length;j++){
                if(tops[j]!= i && bottoms[j]!=i){
                    flag=false;
                    break;
                }
            }
            if(flag){
                //possibleList.add(i);
                possibleArr[i-1]=i;
                flagEmpty=false;
            }
        }
        if(flagEmpty){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for (Integer integer : possibleArr) {
            if(integer!=0){
                int minOpp=Math.min(topOpp(tops, integer),bottomOpp(bottoms, integer));
                min=Math.min(minOpp, min);
            }
        }
        return min;
    } */
}
