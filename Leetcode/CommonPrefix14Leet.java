public class CommonPrefix14Leet {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String newStr="",pref=strs[0];
        for(int i=0;i<pref.length();i++){
            int found=1;
            for (String string : strs) {
                if(string.length()>i){
                    if(string.charAt(i)!=pref.charAt(i)){
                        found=0;
                        break;
                    }
                }
                else{
                    found=0;
                    break;
                }
            }
            if(found==1){
                newStr=newStr+pref.charAt(i);
            }
            else{
                break;
            }            
        }
        return newStr;
    }
    public static void main(String[] args) {
        String []arr={"flower","flow","flowert"};
        CommonPrefix14Leet cm=new CommonPrefix14Leet();
        System.out.println(cm.longestCommonPrefix(arr));
    }
}
