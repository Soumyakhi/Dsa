public class MostWords2114Leet {
    /*public int mostWordsFound(String[] sentences) {
        int max=0;
        for (String string : sentences) {
            String []s=string.split(" ");
            max=Math.max(max, s.length);
        }
        return max;
    }*/
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            sentence = sentence.trim(); 
            int wordCount = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    wordCount++;
                }
            }
            max = Math.max(max, wordCount);
        }
        return max;
    }
    public static void main(String[] args) {
        String []s={"please wait", "continue to fight", "continue to win"};
        MostWords2114Leet ms=new MostWords2114Leet();
        System.out.println(ms.mostWordsFound(s));
    }
}
