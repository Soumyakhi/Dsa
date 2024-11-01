public class Key2Keyboard650Leet {
    int minSteps(int n) {
        if (n == 1) {
            return 0;
        }
        int [][]arr=new int[n][n];
        return minStepsRecursive(n, 1, 0, 1,arr)+1;
    }

    int minStepsRecursive(int target, int current, int steps, int clipboard,int[][] arr) {
        if (current == target) {
            return 0;
        }
        if (current > target) {
            return 1001;
        }
        if(arr[steps][clipboard]!=0){
            return arr[steps][clipboard];
        }
        int copyPaste=minStepsRecursive(target, current*2, steps, current,arr)+2;
        int paste=minStepsRecursive(target, current+clipboard, steps, clipboard,arr)+1;
        int min=Math.min(paste, copyPaste);
        arr[steps][clipboard]=min;
        return min;
    }

    public static void main(String[] args) {
        System.out.println((new Key2Keyboard650Leet()).minSteps(3));
    }
}
