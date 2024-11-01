public class LinkedListCycleII142Leet {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head,fast=head;
        boolean found=false;
        while (fast != null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow.equals(fast)){
                found=true;
                break;
            }
        }
        if(!found){
            return null;
        }
        ListNode entry=head;
        while (!entry.equals(slow)) {
            entry=entry.next;
            slow=slow.next;
        }
        return slow;
    }
}
