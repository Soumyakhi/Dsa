public class StringToInteger8Leet {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()<1){
            return 0;
        }
        boolean pos=true;
        int index=0;
        if(s.charAt(0)=='-'){
            pos=false;
            index++;
        }
        else if(s.charAt(0)=='+'){
            index++;
        }
        while(index<s.length() && s.charAt(index)=='0'){
            index++;
        }
        if(index==s.length()){
            return 0;
        }
        String sum="";
        for(int i=index;i<s.length();i++){
                if((Character.isDigit(s.charAt(i)))){
                    sum=sum+s.charAt(i);
                }
                else{
                    if(sum.length()<1){
                        return 0;
                    }
                    if(pos){
                        if(sum.length()>10 || Long.parseLong(sum)>Integer.MAX_VALUE){
                            return Integer.MAX_VALUE;
                        }
                        return Integer.parseInt(sum);
                    }
                    else{
                        if(sum.length()>10 || Long.parseLong(sum)>Integer.MAX_VALUE){
                            return Integer.MIN_VALUE;
                        }
                        return Integer.parseInt(sum)*-1;
                    }
                
            }
        }
        if(sum.length()<1){
            return 0;
        }
        if(pos){
            if(sum.length()>10 || Long.parseLong(sum)>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            return Integer.parseInt(sum);
        }
        else{
            if(sum.length()>10 || Long.parseLong(sum)>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
            return Integer.parseInt(sum)*-1;
        }
    }
    public static void main(String[] args) {
        System.out.println((new StringToInteger8Leet()).myAtoi("  0000000000012345678"));
    }
}
