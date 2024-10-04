public class PallindromeNum {
    public boolean isPalindrome(int x) {
        if(x>=0)
        {int rev=0;
        int r,num=x;
        while(num!=0){
            r=num%10;
            num=(int)num/10;
            rev=rev*10+r;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
        return false;
    }
    public static void main(String[] args) {
        PallindromeNum p=new PallindromeNum();
        System.out.println(p.isPalindrome(121));
    }
}
