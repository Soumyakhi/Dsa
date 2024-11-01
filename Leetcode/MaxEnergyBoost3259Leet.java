import java.util.Arrays;
public class MaxEnergyBoost3259Leet {
    //HashMap<String,Long> hm=new HashMap<>();
    long [][]arr;
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        arr=new long[energyDrinkA.length][2];
        for (long []i : arr) {
            Arrays.fill(i, -1);
        }
        return Math.max(energyDrinkA[0]+helper(1, 0, energyDrinkA, energyDrinkB),energyDrinkB[0]+helper(1, 1, energyDrinkA, energyDrinkB));
    }
    long helper(int index,int drink,int[] energyDrinkA, int[] energyDrinkB){
        if(index==energyDrinkA.length){
            return 0;
        }
        /*StringBuilder sb=new StringBuilder();
        sb.append(index);
        sb.append(',');
        sb.append(drink);
        String key=sb.toString();
        if(hm.containsKey(key)){
            return hm.get(key);
        }*/
        if(arr[index][drink]!=-1){
            return arr[index][drink];
        }
        long res=0;
        if(drink==0){
            long same=energyDrinkA[index]+helper(index+1, 0, energyDrinkA, energyDrinkB);
            long diff=helper(index+1, 1, energyDrinkA, energyDrinkB);
            res=Math.max(same, diff);
        }
        else{
            long same=energyDrinkB[index]+helper(index+1, 1, energyDrinkA, energyDrinkB);
            long diff=helper(index+1, 0, energyDrinkA, energyDrinkB);
            res=Math.max(same, diff); 
        }
        arr[index][drink]=res;
        //hm.put(key, res);
        return res;
    }
    public static void main(String[] args) {
        int []energyDrinkA={1,3,1};
        int []energyDrinkB={3,1,1};
        System.out.println((new MaxEnergyBoost3259Leet()).maxEnergyBoost(energyDrinkA, energyDrinkB));
    }
}
