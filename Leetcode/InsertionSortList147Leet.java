public class InsertionSortList147Leet {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=new ListNode(Integer.MIN_VALUE);
        while (head!=null) {
            ListNode temp1=temp;
            ListNode prev=temp;
            while (temp1!=null && head.val>temp1.val) {
                prev=temp1;
                temp1=temp1.next;
            }
            prev.next=new ListNode(head.val);
            prev.next.next=temp1;
            head=head.next;
        }
        return temp.next;
    } 
}
