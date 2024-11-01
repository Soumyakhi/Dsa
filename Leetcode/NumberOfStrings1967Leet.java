public class NumberOfStrings1967Leet {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (String string : patterns) {
            if(word.indexOf(string)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String st[]={"a","abc","bc","d"};
        System.out.println((new NumberOfStrings1967Leet()).numOfStrings(st, "abc"));
    }
}

