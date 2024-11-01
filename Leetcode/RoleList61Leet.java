public class RoleList61Leet {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int count =0;
        ListNode temp1=head;
        int len=0;
        while (temp1!=null) {
            temp1=temp1.next;
            len++;
        }
        k=k%len;
        while (count<k) {
            ListNode ptr=head;
            while (ptr.next.next!=null) {
                ptr=ptr.next;
            }
            int val=ptr.next.val;
            ptr.next=null;
            ListNode temp =new ListNode(val);
            temp.next=head;
            head=temp;
            count++;
        }
        return head;
    }
}
