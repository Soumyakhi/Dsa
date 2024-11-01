import java.util.ArrayList;

public class PartitionList86Leet {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode less=new ListNode(-1);
        ListNode temp1=less;
        ListNode more=new ListNode(-1);
        ListNode temp2=more;
        while (temp!=null) {
            if(temp.val<x){
                temp1.next=new ListNode(temp.val);
                temp1=temp1.next;
            }
            else{
                temp2.next=new ListNode(temp.val);
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=more.next;
        return less.next;
    }
}
