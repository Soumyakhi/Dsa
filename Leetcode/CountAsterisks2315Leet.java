public class CountAsterisks2315Leet {
    /*public int countAsterisks(String s) {
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<s.length()){
            if(s.charAt(index)=='|'){
                index++;
                while (index<s.length() && s.charAt(index)!='|') {
                    index++;
                }
                index++;
            }
            if(index<s.length() && s.charAt(index)!='|'){
                sb.append(s.charAt(index++));
            }
        }
        System.out.println(sb);
        int ast=0;
        for (Character ch : (sb.toString()).toCharArray()) {
            if(ch=='*'){
                ast++;
            }
        }
        return ast;
    }*/
    public int countAsterisks(String s) {
        int ast=0,len=s.length();
        boolean inside=false;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='|'){
                if(inside){
                    inside=false;
                }
                else{
                    inside=true;
                }
            }
            else if(!inside && s.charAt(i)=='*'){
                ast++;
            }
        }
        return ast;
    }
    public static void main(String[] args) {
        System.out.println((new CountAsterisks2315Leet())
        .countAsterisks("*||*|||||*|*|***||*||***|"));
    }
}
