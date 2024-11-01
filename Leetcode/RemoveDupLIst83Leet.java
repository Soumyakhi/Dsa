import java.util.HashSet;

public class RemoveDupLIst83Leet {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr=head;
        HashSet<Integer> hs=new HashSet<>();
        while (ptr!=null && ptr.next!=null) {
            hs.add(ptr.val);
            if(hs.contains(ptr.next.val)){
                ptr.next=ptr.next.next;
            }
            else{
                ptr=ptr.next;
            }
        }
        System.gc();
        return head;
    }
}
