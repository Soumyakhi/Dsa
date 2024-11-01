public class SwapNodesPairs24Leet {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode ptr=head;
        while (ptr!=null && ptr.next!=null) {
            ListNode temp1=ptr;
            ListNode temp2=ptr.next;
            ptr=temp2;
            ptr.next=temp1;
            ptr=ptr.next.next;
        }
        return head; 
    }
}
