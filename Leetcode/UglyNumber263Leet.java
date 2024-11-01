public class UglyNumber263Leet {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        if (n == 1) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        UglyNumber263Leet un = new UglyNumber263Leet();
        System.out.println(un.isUgly(1352));
    }
}
