import java.util.LinkedList;
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

public class MyHashSet705Leet {
    private Node[] arr;
    private final int SIZE = 10000;
    public MyHashSet705Leet() {
        arr = new Node[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = new Node(-99);
        }
    }
    
    public void add(int key) {
        int index=key%SIZE;
        Node temp=this.arr[index];
        while (temp.next!=null) {
            if(temp.data==key){
                return;
            }
            temp=temp.next;
        }
        if(temp.data!=key){
            temp.next=new Node(key);
        }
    }
    
    public void remove(int key) {
        int index=key%SIZE;
        Node temp=this.arr[index];
        while (temp.next!=null && temp.next.data!=key) {
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }
    
    public boolean contains(int key) {
        int index=key%SIZE;
        Node temp=this.arr[index];
        while (temp!=null) {
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
