import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortFrequency1636Leet {
    public int[] frequencySort(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 1) + 1);
        }
        list.sort((a, b) -> {
            int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
            if (freqCompare == 0) {
                return -1*Integer.compare(a, b); 
            }
            return freqCompare;
        });
        int index=0;
        for (Integer integer : list) {
            nums[index++]=integer;
        }
        return nums;
    }
}
