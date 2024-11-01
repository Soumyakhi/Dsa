public class FindValue2011Leet{
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for (String string : operations) {
            if(string.equals("X++") || string.equals("++X") ){
                res++;
            }
            else if(string.equals("--X") || string.equals("X--") ){
                res--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        FindValue2011Leet fc=new FindValue2011Leet();
        String []arr={"--X","X++","X++"};
        System.out.println(fc.finalValueAfterOperations(arr));
    }
}