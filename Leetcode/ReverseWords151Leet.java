public class ReverseWords151Leet {
    public String reverseWords(String s) {
        String newStr=s.trim();
        String []newStrArr=newStr.split(" ");
        String res="";
        for(int i=newStrArr.length-1;i>-1;i--){
            if(newStrArr[i].equals("")==false){
                res+=(newStrArr[i]+" ");
            }
            
        }
        res=res.trim();
        return res;
    }
    public static void main(String[] args) {
        ReverseWords151Leet lt=new ReverseWords151Leet();
        System.out.println(lt.reverseWords("  a good   example  "));
    }
}
