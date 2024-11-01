public class TwoSumii167Leet {
    /*public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int arr[]=new int[2];
        while (start<end) {
            if(numbers[start]+numbers[end]==target){
                System.gc();
                arr[0]=start+1;
                arr[1]=end+1;
                return arr;
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return arr;
    }*/
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int mid=(i+j)/2;
            int sum=numbers[i]+numbers[j];
            if(sum==target)
                return new int[]{i+1,j+1};
            else if(target<sum){
                if(target<numbers[i]+numbers[mid])
                    j=mid-1;
                else
                    j--;
            }
            else{
                if(target>numbers[mid]+numbers[j])
                    i=mid+1;
                else
                    i++;
            }
        }
        return new int[]{i+1,j+1};
    }
    public static void main(String[] args) {
        int n[]={2,7,11,15};
        int arr[]=(new TwoSumii167Leet()).twoSum(n, 9);
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
}
