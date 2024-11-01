public class NUmberOfKeys3079Leet {
    public int countKeyChanges(String s) {
        int len=s.length();
        if(len<2){
            return 0;
        }
        int count=0;
        for(int i=0;i<len-1;i++){
            if(s.charAt(i)!=s.charAt(i+1) && 
            Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(i+1))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NUmberOfKeys3079Leet nm=new NUmberOfKeys3079Leet();
        System.out.println(nm.countKeyChanges("aAbBcC"));
    }
}
