public class GoatLatin824Leet {
    public String toGoatLatin(String sentence) {
        StringBuilder sb=new StringBuilder();
        String sentenceArr[]=sentence.split(" ");
        for (int i=0;i<sentenceArr.length;i++) {
            char chr=sentenceArr[i].charAt(0);
            if(isVowel(chr)){
                sb.append(sentenceArr[i]);
                sb.append("ma");
                sb.append("a".repeat(i+1));
                sb.append(" ");
            }
            else{
                if(sentenceArr[i].length()>1){
                    sb.append(sentenceArr[i].substring(1));
                }
                sb.append(sentenceArr[i].charAt(0));
                sb.append("ma");
                sb.append("a".repeat(i+1));
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'
        || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println((new GoatLatin824Leet()).toGoatLatin("I speak Goat Latin"));
    }
}
