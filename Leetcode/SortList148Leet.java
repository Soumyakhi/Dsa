import java.util.ArrayList;
import java.util.Collections;

public class SortList148Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode sortList(ListNode head) {
        ListNode ptr=head;
        ArrayList<Integer> al=new ArrayList<>();
        while (ptr!=null) {
            al.add(ptr.val);
            ptr=ptr.next;
        }
        Collections.sort(al);
        ListNode head2=new ListNode(-55);
        ptr=head2;
        for (Integer integer : al) {
            ptr.next=new ListNode(integer);
            ptr=ptr.next;
        }
        return head2.next;
    }
}
