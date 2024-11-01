public class MountainArray941Leet {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        if(arr[0]>=arr[1]){
            return false;
        }
        int index=0;
        while(index<arr.length-1 && arr[index]<arr[index+1]){
            index++;
        }
        if(index>=arr.length-1){
            return false;
        }
        while(index<arr.length-1){
            if(arr[index]<=arr[index+1]){
                return false;
            }
            index++;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println((new MountainArray941Leet()).validMountainArray(arr));
    }
}
