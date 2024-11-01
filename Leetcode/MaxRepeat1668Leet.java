public class MaxRepeat1668Leet {
    public int maxRepeating(String sequence, String word) {
        int maxCount = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb.toString())) {
            maxCount++;
            sb.append(word);
        }
        
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println((new MaxRepeat1668Leet()).maxRepeating("ababc", "ab"));
    }
}
