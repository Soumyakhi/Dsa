public class NBouquets1482Leet {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) bloomDay.length < (long) m * k) {
            return -1;
        }
        int low = 1, high = max(bloomDay), res = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = count(bloomDay, mid, k);
            if (count >= m) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    int count(int[] arr, int day, int k) {
        int bouquets = 0, flowers = 0;
        for (int value : arr) {
            if (value <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 3, 10, 2 };
        System.out.println((new NBouquets1482Leet()).minDays(arr, 3, 1));
    }
}
