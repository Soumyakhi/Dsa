public class EmployeeTarget2798Leet {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for (int i : hours) {
            if(i>=target)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        System.out.println((new EmployeeTarget2798Leet()).numberOfEmployeesWhoMetTarget(arr, 2));
    }
}
