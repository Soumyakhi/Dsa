import java.util.*;

public class ShortestWord748Leet {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int resIndex = words.length;
        Map<Character, Integer> freqMap = new HashMap<>();
        for (Character chr : licensePlate.toCharArray()) {
            if (Character.isLetter(chr)) {
                freqMap.put(Character.toLowerCase(chr), freqMap.getOrDefault(Character.toLowerCase(chr), 0) + 1);
            }
        }
        for (int i=0;i<words.length;i++) {
            Map<Character, Integer> wordFreqMap = new HashMap<>();
            for (Character chr : words[i].toCharArray()) {
                if (freqMap.containsKey(chr)) {
                    wordFreqMap.put(Character.toLowerCase(chr),
                            wordFreqMap.getOrDefault(Character.toLowerCase(chr), 0) + 1);
                }
            }
            boolean formsWord=true;
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                if(wordFreqMap.getOrDefault(entry.getKey(),0)<entry.getValue()){
                    formsWord=false;
                    break;
                }
            }
            if(formsWord){
                if(resIndex==words.length || words[resIndex].length()>words[i].length()){
                    resIndex=i;
                }
            }
        }
        return words[resIndex];
    }
}
