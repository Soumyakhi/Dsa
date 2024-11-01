public class ReverseAString344Leet {
    public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char []s={'h','e','l','l','o'};
        ReverseAString344Leet rv=new ReverseAString344Leet();
        rv.reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
}
