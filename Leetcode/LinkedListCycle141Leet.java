public class LinkedListCycle141Leet {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode ptr = head;
        while (ptr != null) {
            if (hs.contains(ptr)) {
                return true; 
            } else {
                hs.add(ptr);
            }
            ptr = ptr.next;
        }
        return false;
    }*/
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head,fast=head.next;
        while (fast != null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow.equals(fast)){
                return true;
            }
        }
        return false;
    }
}
