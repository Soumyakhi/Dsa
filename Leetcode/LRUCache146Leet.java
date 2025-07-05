import java.util.Deque;
import java.util.*;
import java.util.LinkedList;
class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class Dll{
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    Dll(){
        head.next=tail;
        tail.prev=head;
    }
    Node insertFirst(int key,int val){
        Node n=new Node(key,val);
        n.prev=head;
        n.next=head.next;
        head.next.prev=n;
        head.next=n;
        return n;
    }
    void del(Node n){
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
    Node delLast(){
        Node n=tail.prev;
        tail.prev.prev.next=tail;
        tail.prev=tail.prev.prev;
        return n;
    }
}
public class LRUCache146Leet {
    int cap;
    int size;
    Dll dll=new Dll();
    Map<Integer,Node> hm=new HashMap<>();
    public LRUCache146Leet(int capacity) {
        cap=capacity;
        size=0;
    }
    public int get(int key) {
        if(hm.containsKey(key)){
            Node n=hm.get(key);
            int val=n.val;
            dll.del(n);
            hm.put(key,dll.insertFirst(key,val));
            return val;
        }
        return -1;
    }
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            dll.del(hm.get(key));
            hm.put(key,dll.insertFirst(key,value));
        }
        else if(size==cap){
            hm.remove(dll.delLast().key);
            hm.put(key, dll.insertFirst(key,value));
        }
        else{
            hm.put(key, dll.insertFirst(key,value));
            size++;
        }
    }
}
