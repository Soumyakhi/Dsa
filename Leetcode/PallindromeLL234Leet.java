import java.util.Stack;

public class PallindromeLL234Leet {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> s=new Stack<>();
        while (temp!=null) {
            s.push(temp.val);
            temp=temp.next;
        }
        while (head!=null) {
            if(head.val!=s.pop()){
                return false;
            }
            head=head.next;
            
        }
        return true;
    }
}
