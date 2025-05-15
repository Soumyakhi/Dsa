public class RevPrefix2000Leet {
    public String reversePrefix(String word, char ch) {
        StringBuilder stringBuilder=new StringBuilder();
        int i=0,flag=0;
        for (char chr : word.toCharArray()) {
            stringBuilder.append(chr);
            i++;
            if(chr==ch){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return word;
        }
        stringBuilder=stringBuilder.reverse();
        stringBuilder.append(word.substring(i));
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println((new RevPrefix2000Leet()).reversePrefix("abcdefd", 'd'));
    }
}
