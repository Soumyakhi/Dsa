public class AddSpace2109Leet {
    public String addSpaces(String s, int[] spaces) {
        int ptr=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==spaces[ptr]){
                sb.append(" "+s.charAt(i));
                if(ptr<spaces.length-1){
                    ptr++;
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.gc();
        return sb.toString();
    }
    public static void main(String[] args) {
        int []spaces={8,13,15};
        System.out.println((new AddSpace2109Leet()).addSpaces("LeetcodeHelpsMeLearn", spaces));
    }
}
