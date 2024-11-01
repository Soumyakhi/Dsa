public class OddEvenLinkedList328Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null || head.next.next==null){
            return head;
        }
        
            ListNode odd=head;
            ListNode ptr1=odd;
            ListNode even=new ListNode(-1);
            ListNode ptr2=even;
            while (ptr1!=null && ptr1.next!=null) {
                ptr2.next=new ListNode(ptr1.next.val);
                ptr2=ptr2.next;
                ptr1.next=ptr1.next.next;
                ptr1=ptr1.next;
            }
            
            /*while (ptr2!=null && ptr2.next!=null) {
                ptr2.next=ptr2.next.next;
                ptr2=ptr2.next;
            }
            ptr1.next=even;*/
            return odd;
        }
}
