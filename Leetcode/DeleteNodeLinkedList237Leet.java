
public class DeleteNodeLinkedList237Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
    ListNode head=null;
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
	    node.next = node.next.next;
    }
}
