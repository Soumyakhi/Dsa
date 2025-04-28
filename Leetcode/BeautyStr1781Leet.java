import java.util.HashMap;
import java.util.Map;

public class BeautyStr1781Leet {
    /*public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String subString=s.substring(i, j+1);
                Map<Character,Integer> freqMap=new HashMap<>();
                for (char chr: subString.toCharArray()) {
                    freqMap.put(chr, freqMap.getOrDefault(chr, 0)+1);
                }
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                    max=Math.max(max, entry.getValue());
                    min=Math.min(min,entry.getValue());
                }
                count+=max-min;  
        }
        
    }
        return count;
    }*/
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
    
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
    
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
    
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
    
                totalBeauty += (max - min);
            }
        }
    
        return totalBeauty;
    }
    public static void main(String[] args) {
        System.out.println((new BeautyStr1781Leet()).beautySum("aabcb"));
    }
}
