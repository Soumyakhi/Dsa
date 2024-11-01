public class SwapNodes1721Leet {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ln=head;
        k=k-1;
        int len=0;
        ListNode ptr1=new ListNode(-1),ptr2=new ListNode(-1);
        while (ln!=null) {
            if(len==k){
                ptr1=ln;
            }
            len++;
            ln=ln.next;
        }
        ln=head;
        int count=0;
        while (ln!=null) {
            if(count==(len-1-k)){
                ptr2=ln;
                break;
            }
            count++;
            ln=ln.next;
        }
        int temp=ptr1.val;
        ptr1.val=ptr2.val;
        ptr2.val=temp;
        return head;
    }
}
