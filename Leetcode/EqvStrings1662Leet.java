public class EqvStrings1662Leet {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (String string : word1) {
            sb1.append(string);
        }
        for (String string : word2) {
            sb2.append(string);
        }
        return (sb1.toString()).equals(sb2.toString());
    }
    public static void main(String[] args) {
        String []word1={"abc", "d", "defg"};
        String []word2={"abcddefg"};
        System.out.println((new EqvStrings1662Leet()).arrayStringsAreEqual(word1, word2));
    }   
}
