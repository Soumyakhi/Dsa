import java.util.ArrayList;
public class StackWithIncrementOperation131Leet {
    int max;
    ArrayList<Integer> al=new ArrayList<>();
    public StackWithIncrementOperation131Leet(int maxSize) {
        this.max=maxSize;
    }
    
    public void push(int x) {
        if(this.al.size()<max){
            al.add(x);
        }
    }
    
    public int pop() {
        int len=al.size();
        if(len==0){
            return -1;
        }
        return al.remove(al.size()-1);
    }
    public void increment(int k, int val) {
        int len=al.size();
        if(k<len){
            for(int i=0;i<k;i++){
                al.set(i, al.get(i)+val);
            }
        }
        else{
            for(int i=0;i<len;i++){
                al.set(i, al.get(i)+val);
            }
        }
    }
}
