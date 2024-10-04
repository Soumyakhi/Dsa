public class ReverseInt {
    public int reverse(int x) {
        if (x < Integer.MAX_VALUE && x>(Integer.MAX_VALUE*-1)) {
            int res = 0;
            int r;
            if (x > 0) {
                while (x != 0) {
                    r = x % 10;
                    x = (int) x / 10;
                    if(res>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    res = res * 10 + r;
                }
            } else {
                x *= -1;
                while (x != 0) {
                    r = x % 10;
                    x = (int) x / 10;
                    if(res>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    res = res * 10 + r;
                }
                res *= -1;
            }
            return res;
        }
        
        return 0;
    }

    public static void main(String[] args) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverse(1056389759));
    }
}
