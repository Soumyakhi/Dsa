import java.util.Arrays;
import java.util.Comparator;

public class Largest179Leet {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                return order2.compareTo(order1);
            }
        });
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }

        return res.toString();
    }
    public static void main(String[] args) {
        int []nums={432,43243};
        System.out.println((new Largest179Leet()).largestNumber(nums));
    }
}
