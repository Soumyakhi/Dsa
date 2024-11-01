public class HighestAlt1732Leet {
    public int largestAltitude(int[] gain) {
        int largest=0,currHeight=0;
        for (int i=0;i<gain.length;i++) {
            largest=Math.max(largest, gain[i]+currHeight);
            currHeight=gain[i]+currHeight;
        }
        return largest;
    }
    public static void main(String[] args) {
        int []gain={-5,1,5,0,-7};
        System.out.println((new HighestAlt1732Leet()).largestAltitude(gain));
    }
}
