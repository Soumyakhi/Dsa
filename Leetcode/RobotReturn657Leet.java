public class RobotReturn657Leet {
    public boolean judgeCircle(String moves) {
        int v=0,h=0;
        for (Character ch : moves.toCharArray()) {
            if(ch=='U'){
                v++;
            }
            else if(ch=='D'){
                v--;
            }
            else if(ch=='L'){
                h--;
            }
            else if(ch=='R'){
                h++;
            }
        }
        return (v==0)&&(h==0);
    }
    public static void main(String[] args) {
        System.out.println((new RobotReturn657Leet()).judgeCircle("UD"));
    }
}
