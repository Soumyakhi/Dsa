public class PercentageOfLetter2278Leet {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        return count*100/s.length();
    }
    public static void main(String[] args) {
        System.out.println((new PercentageOfLetter2278Leet()).percentageLetter("foobar", 'o'));
    }
}
