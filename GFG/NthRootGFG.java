public class NthRootGFG {
    public int nthRoot(int n, int m) {
        if (m == 0 || m == 1) {
            return m;
        }
        int left = 1, right = m;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long res=(long)Math.pow(mid, n);
            if (res == m) {
                return mid;
            }
            if (res < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println((new NthRootGFG()).nthRoot(1, 14));
    }
}
