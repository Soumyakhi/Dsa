import java.util.LinkedList;

public class Deque641Leet {
    LinkedList<Integer> ll;
    int cap;
    public Deque641Leet(int k) {
        this.ll=new LinkedList<>();
        this.cap=k;
    }
    
    public boolean insertFront(int value) {
        if(ll.size()<cap){
            ll.add(0, value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
        if(ll.size()<cap){
            ll.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(ll.isEmpty()){
            return false;
        }
        ll.removeFirst();
        return true;
    }
    
    public boolean deleteLast() {
        if(ll.isEmpty()){
            return false;
        }
        ll.removeLast();
        return true;
    }
    public int getFront() {
        if(ll.isEmpty()){
            return -1;
        }
        return ll.get(0);
    }
    
    public int getRear() {
        if(ll.isEmpty()){
            return -1;
        }
        return ll.get(ll.size()-1);
    }
    
    public boolean isEmpty() {
        return ll.isEmpty();
    }
    
    public boolean isFull() {
        return ll.size()==cap;
    }
}
