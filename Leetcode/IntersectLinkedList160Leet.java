import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class IntersectLinkedList160Leet {
    public class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        LinkedHashSet<ListNode> hs1=new  LinkedHashSet<>();
        ListNode temp=headA;
        while (temp!=null) {
            hs1.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while (temp!=null) {
            if(hs1.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}
