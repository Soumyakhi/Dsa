public class BinaryToInt1290Leet {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        StringBuilder sb=new StringBuilder();
        while (temp!=null) {
            sb.append(temp.val);
            temp=temp.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
