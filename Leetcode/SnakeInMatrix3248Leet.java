import java.util.ArrayList;

public class SnakeInMatrix3248Leet {
    public int finalPositionOfSnake(int n, ArrayList<String> commands) {
        int vertical=0,horizontal=0;
        for (String string : commands) {
            if(string.equals("RIGHT")){
                horizontal++;
            }
            else if(string.equals("LEFT")){
                horizontal--;
            }
            else if(string.equals("DOWN")){
                vertical++;
            }
            else{
                vertical--;
            }
        }
        int count=0;
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(vertical==i && horizontal==j){
                    return count;
                }
                count++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<String> commands=new ArrayList<>();
        commands.add("RIGHT");
        commands.add("DOWN");
        System.out.println((new SnakeInMatrix3248Leet()).finalPositionOfSnake(2, commands));
    }
}
