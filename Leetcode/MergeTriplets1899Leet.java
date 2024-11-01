public class MergeTriplets1899Leet {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean gotFirst=false,gotSecond=false,gotLast=false;
        for (int arr[] : triplets) {
            if(arr[0]>target[0] || arr[1]>target[1] || arr[2]>target[2]){
                continue;
            }
            if(arr[0]==target[0]){
                gotFirst=true;
            }
            if(arr[1]==target[1]){
                gotSecond=true;
            }
            if(arr[2]==target[2]){
                gotLast=true;
            }
        }
        return gotFirst && gotSecond && gotLast;
        }
        public static void main(String[] args) {
            int [][]target={{2,5,3},{1,8,4},{1,7,5}};
            int arr[]={2,7,5};
            System.out.println((new MergeTriplets1899Leet()).mergeTriplets(target,arr));
        }
    }
    

