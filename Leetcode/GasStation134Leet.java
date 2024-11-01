public class GasStation134Leet {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0,costSum=0;
        for (int i : cost) {
            costSum+=i;
        }
        for (int i : gas) {
            gasSum+=i;
        }
        if(gasSum<costSum){
            return -1;
        }
        int total=0,start=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                start=i+1;
                total=0;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        System.out.println((new GasStation134Leet()).canCompleteCircuit(gas, cost));
    }
}
