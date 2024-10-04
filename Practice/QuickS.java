class QuickS{
    static int partition(int arr[],int low,int high){
        int i=low-1,pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                int temp;
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }  
        }
        i++;
        int temp=pivot;
        pivot=arr[i];
        arr[i]=temp;
        arr[high]=pivot;
        return i;
    }
    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,4,5,8};
        int n=arr.length-1;
        quickSort(arr,0, n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}