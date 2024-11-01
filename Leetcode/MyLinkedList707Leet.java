public class MyLinkedList707Leet{
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head=null;
    
    public int get(int index) {
        int idx=0;
        if(head==null){
            return -1;
        }
        Node ptr=head;
        while (ptr!=null) {
            if(index==idx){
                return ptr.val;
            }
            ptr=ptr.next;
            idx++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        if(head==null){
            head=new Node(val);
        }
        else{
            Node temp=head;
            head=new Node(val);
            head.next=temp;
        }
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head=new Node(val);
        }
        else{
            Node ptr=head;
            while (ptr.next!=null) {
                ptr=ptr.next;
            }
            ptr.next=new Node(val);
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            Node temp=head;
            head=new Node(val);
            head.next=temp;
        }
        else{
            Node ptr=head;
            int idx=0;
            while (ptr!=null) {
            if(index-1==idx){
                break;
            }
            ptr=ptr.next;
            idx++;
            }
            if(ptr==null){
                return;
            }
            Node temp=ptr.next;
            ptr.next=new Node(val);
            ptr.next.next=temp;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        if(index==0){
            head=head.next;
        }
        else{
            Node ptr=head;
            int idx=0;
            while (ptr!=null) {
            if(index-1==idx){
                break;
            }
            ptr=ptr.next;
            idx++;
            }
            if(ptr==null){
                return;
            }
            if(ptr.next==null){
                return;
            }
            ptr.next=ptr.next.next;
        }
    }
    
    public static void main(String[] args) {
        MyLinkedList707Leet obj = new MyLinkedList707Leet();
        obj.addAtHead(3);
        obj.addAtHead(8);
        obj.addAtHead(10);
        obj.addAtTail(4);
        obj.addAtTail(28);
        obj.addAtIndex(1,6);
        obj.deleteAtIndex(1);
        int param_1 = obj.get(2);
        System.out.println(param_1);
        /*obj.addAtHead(3);
        obj.addAtTail(4);
        obj.addAtIndex(1,6);
        obj.deleteAtIndex(1);*/
    }
}
