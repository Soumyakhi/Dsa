public class ReverseLinkedListII92Leet {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next ==null){
            return head;
        }
        ListNode ptr=head;
        ListNode l1=new ListNode(-600);
        ListNode temp1=l1;
        ListNode ranged=new ListNode(-600);
        ListNode temp2=ranged;
        ListNode l3=new ListNode(-600);
        ListNode temp3=l3;
        int count=1;
        while (ptr!=null) {
            if(count<left){
                temp1.next=new ListNode(ptr.val);
                temp1=temp1.next;
            }
            else if(count<=right){
                temp2.next=new ListNode(ptr.val);
                temp2=temp2.next;
            }
            else{
                temp3.next=new ListNode(ptr.val);
                temp3=temp3.next;
            }
            ptr=ptr.next;
            count++;
        }
        ptr=l1;
        while (ptr.next!=null) {
            ptr=ptr.next;
        }
        ptr.next=reverseList(ranged.next);
        ptr=l1;
        while (ptr.next!=null) {
            ptr=ptr.next;
        }
        ptr.next=l3.next;
        return l1.next;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}