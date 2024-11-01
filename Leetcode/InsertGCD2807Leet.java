class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class InsertGCD2807Leet {
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while (temp.next!=null) {
            int val=gcd(temp.val, temp.next.val);
            ListNode temp1=temp.next;
            ListNode gcd=new ListNode(val);
            temp.next=gcd;
            gcd.next=temp1;
            temp=temp1;
        }
        return head;
    }
}
