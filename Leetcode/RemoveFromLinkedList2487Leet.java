import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

public class RemoveFromLinkedList2487Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
         public ListNode removeNodes(ListNode head) {
            ListNode ln=reverseList(head);
            Stack<ListNode> st=new Stack<>();
            ListNode temp=ln;
            st.push(temp);
            temp=temp.next;
            st.peek().next=null;
            while (temp!=null) {
                if(temp.val>=st.peek().val){
                    st.push(temp);
                    st.peek().next=null;
                }
                temp=temp.next;
                
            }
            ln.next=null;
            while (!st.isEmpty()) {
                System.out.println(st.pop().val);
                ln.next=st.pop();
                ln.next.next=null;
            }
            return ln;
        }
        ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode rest = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return rest;
        }
}
