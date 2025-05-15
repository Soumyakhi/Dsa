import java.util.*;

public class Finding3DigEven2094Leet {
    /*
     * public int[] findEvenNumbers(int[] digits) {
     * Set<Integer> numSet = new HashSet<>();
     * for (int i = 0; i < digits.length; i++) {
     * getNumbers("", digits, new HashSet<>(), numSet, i);
     * }
     * int[] result = new int[numSet.size()];
     * int indexRes=0;
     * for (Integer i : numSet) {
     * result[indexRes++]=i;
     * }
     * Arrays.sort(result);
     * return result;
     * }
     * void getNumbers(String current, int[] digits, Set<Integer> usedIndices,
     * Set<Integer> numSet, int index) {
     * if (current.length() > 3) return;
     * current += digits[index];
     * usedIndices.add(index);
     * if (current.length() == 3) {
     * if (checkValid(current)) {
     * numSet.add(Integer.parseInt(current));
     * }
     * } else {
     * for (int i = 0; i < digits.length; i++) {
     * if (!usedIndices.contains(i)) {
     * getNumbers(current, digits, usedIndices, numSet, i);
     * }
     * }
     * }
     * usedIndices.remove(index);
     * }
     * 
     * boolean checkValid(String numStr) {
     * return numStr.charAt(0) != '0' && (numStr.charAt(2) - '0') % 2 == 0;
     * }
     */
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> digSet = new HashSet<>();
        Map<Integer, Integer> digCount = new HashMap<>();
        for (int i : digits) {
            digCount.put(i, digCount.getOrDefault(i, 0) + 1);
        }
        for (int i = 100; i < 1000; i+=2) {
            String num = i + "";
            Map<Integer, Integer> numMap = new HashMap<>();
            for (char j : num.toCharArray()) {
                int dig = Character.getNumericValue(j);
                numMap.put(dig, numMap.getOrDefault(dig, 0) + 1);
            }
            boolean flag=true;
            for (Map.Entry<Integer, Integer> set : numMap.entrySet()) {
                if (!(digCount.getOrDefault(set.getKey(),0) >= set.getValue())) {
                    flag=false;
                }
                
            }
            if(flag){
                    digSet.add(i);
            }

        }
        int[] result = new int[digSet.size()];
        int indexRes = 0;
        for (Integer integer : digSet) {
            result[indexRes++] = integer;
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 0 };
        System.out.println(Arrays.toString((new Finding3DigEven2094Leet()).findEvenNumbers(arr)));
    }
}
