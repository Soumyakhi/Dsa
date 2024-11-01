public class RemoveNthNodeLast19Leet {
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ln=head;
            int len=0;
            while (ln!=null) {
                len++;
                ln=ln.next;
            }
            ln=head;
            if(len-n==0){
                return head.next;
            }
            if(len==1){
                return head.next;
            }
            if(n==1){
                while (ln.next.next!=null) {
                    ln=ln.next;
                }
                ln.next=null;
                return head;
            }
            int count=0;
            while (count!=(len-n-1)) {
                count++;
                ln=ln.next;
            } 
            ln.next=ln.next.next;
            return head;     
        }
}
