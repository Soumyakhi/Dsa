public class ShuffleStr1528Leet {
    public String restoreString(String s, int[] indices) {
        char[]carr=new char[s.length()];
        for(int i=0;i<carr.length;i++){
            carr[indices[i]]=s.charAt(i);
        }
        return String.valueOf(carr);
    }
    public static void main(String[] args) {
        ShuffleStr1528Leet sf=new ShuffleStr1528Leet();
        int []indices={4,5,6,7,0,2,1,3};
        System.out.println(sf.restoreString("codeleet",indices));
    }
}
