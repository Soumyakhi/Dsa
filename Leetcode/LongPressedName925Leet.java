import java.util.ArrayList;

public class LongPressedName925Leet {
    public boolean isLongPressedName(String name, String typed) {
        ArrayList<String> sb=new ArrayList<>();
        for(int i=0;i<name.length();i++){
            int count=1;
            char curr=name.charAt(i);
            while (i<name.length()-1 && name.charAt(i+1)==curr) {
                count++;
                i++;
            }
            sb.add(Character.toString(curr));
            sb.add(Integer.toString(count));
        }
        ArrayList<String> sb1=new ArrayList<>();
        for(int i=0;i<typed.length();i++){
            int count=1;
            char curr=typed.charAt(i);
            while (i<typed.length()-1 && typed.charAt(i+1)==curr) {
                count++;
                i++;
            }
            sb1.add(Character.toString(curr));
            sb1.add(Integer.toString(count));
        }
        if(sb1.equals(sb)){
            return true;
        }
        if(sb.size()!=sb1.size()){
            return false;
        }
        for(int i=0;i<sb.size();i++){
            if(i%2==0){
                if(!sb.get(i).equals(sb1.get(i))){
                    return false;
                }
            }
            else{
                if(Integer.parseInt(sb.get(i))>Integer.parseInt(sb1.get(i))){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((new LongPressedName925Leet()).isLongPressedName("a", "aaaaaaaaaaaaaaaaa"));
    }
}
