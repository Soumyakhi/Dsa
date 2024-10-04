public class InserS {
    public static void main(String[] args) {
        int arr[]={6,3,9,4,5,8};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=current;
        }
    }
}
