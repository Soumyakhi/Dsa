public class GeeksTrainingGFG {
    int cache[][];
    public int maximumPoints(int arr[][], int N) {
        cache=new int[arr.length][3];
        return helper(arr, 0, -1);
    }
    int helper(int [][]arr,int i,int prevJ){
        if(i==arr.length){
            return 0;
        }
        if(prevJ!=-1 && cache[i][prevJ]!=0){
            return cache[i][prevJ];
        }
        int running=arr[i][0]+helper(arr, i+1, 0);
        int fighting=arr[i][1]+helper(arr, i+1, 1);
        int practice=arr[i][2]+helper(arr, i+1, 2);
        if(prevJ==0){
            running=Integer.MIN_VALUE;
        }
        if(prevJ==1){
            fighting=Integer.MIN_VALUE;
        }
        if(prevJ==2){
            practice=Integer.MIN_VALUE;
        }
        int res=Math.max(Math.max(running, fighting),practice);
        if(prevJ!=-1){
            cache[i][prevJ]=res;
        }
        return res;
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,5},{3,1,1},{3,3,3}};
        System.out.println((new GeeksTrainingGFG()).maximumPoints(arr, 3));
    }
}
