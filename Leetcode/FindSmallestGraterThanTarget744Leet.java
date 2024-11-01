public class FindSmallestGraterThanTarget744Leet {
    public char nextGreatestLetter(char[] letters, char target) {
        char min=Character.MAX_VALUE;
        for (char c : letters) {
            if(c>target){
                if(c<min){
                    min=c;
                }
            }
        }
        if(min==Character.MAX_VALUE){
            return letters[0];
        }
        return min;
    }
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        System.out.println((new FindSmallestGraterThanTarget744Leet()).nextGreatestLetter(letters, 'z'));
    }
}
