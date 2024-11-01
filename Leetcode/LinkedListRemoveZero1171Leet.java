import java.util.HashMap;

public class LinkedListRemoveZero1171Leet {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> hm=new HashMap<>();
        ListNode start=new ListNode(0);
        ListNode temp=start;
        hm.put(0, temp);
        temp.next=head;
        int sum=0;
        while (temp!=null){
            sum=sum+temp.val;
            hm.put(sum, temp);
            temp=temp.next;
        }
        temp=start;
        sum=0;
        while (temp!=null) {
            sum=sum+temp.val;
            temp.next=hm.get(sum).next;
            temp=temp.next;
        }
        return start.next;
    }
}
