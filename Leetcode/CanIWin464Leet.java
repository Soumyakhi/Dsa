import java.util.HashMap;
import java.util.Map;

public class CanIWin464Leet {
    /*private Map<String, Boolean> memo = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

        boolean[] used = new boolean[maxChoosableInteger + 1];
        return canWin(maxChoosableInteger, desiredTotal, used);
    }

    private boolean canWin(int maxChoosableInteger, int desiredTotal, boolean[] used) {
        String key = getKey(used, desiredTotal);
        if (memo.containsKey(key)) return memo.get(key);

        for (int i = 1; i <= maxChoosableInteger; i++) {
            if (!used[i]) {
                used[i] = true;
                if (desiredTotal <= i || !canWin(maxChoosableInteger, desiredTotal - i, used)) {
                    used[i] = false;
                    memo.put(key, true);
                    return true;
                }
                used[i] = false;
            }
        }

        memo.put(key, false);
        return false;
    }

    private String getKey(boolean[] used, int desiredTotal) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<used.length;i++) {
            sb.append(used[i] ? '1' : '0');
        }
        sb.append(":").append(desiredTotal);
        return sb.toString();
    }*/
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= 0) return true;
        if ((maxChoosableInteger * (maxChoosableInteger + 1)) / 2 < desiredTotal) return false;

        int initialState = 0;
        return canWin(maxChoosableInteger, desiredTotal, initialState);
    }

    private boolean canWin(int maxChoosableInteger, int desiredTotal, int state) {
        String key =state+","+desiredTotal;
        if (memo.containsKey(key)) return memo.get(key);

        for (int i = 0; i < maxChoosableInteger; i++) {
            int bit = 1 << i;
            if ((state & bit) == 0) { // Check if integer (i + 1) is used
                int newState = state | bit; // Set integer (i + 1) as used
                if (desiredTotal <= (i + 1) || !canWin(maxChoosableInteger, desiredTotal - (i + 1), newState)) {
                    memo.put(key, true);
                    return true;
                }
            }
        }

        memo.put(key, false);
        return false;
    }

    public static void main(String[] args) {
        System.out.println((new CanIWin464Leet()).canIWin(20, 152));
    }
}

