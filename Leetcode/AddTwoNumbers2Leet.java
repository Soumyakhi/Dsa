public class AddTwoNumbers2Leet {
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while (l1!=null && l2!=null) {
            int sum=l1.val+l2.val+carry;
            if(sum>9){
                temp.next=new ListNode(sum%10);
                carry=sum/10;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(sum);
                carry=0;
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null) {
            int sum=l1.val+carry;
            if(sum>9){
                temp.next=new ListNode(sum%10);
                carry=sum/10;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(sum);
                carry=0;
                temp=temp.next;
            }
            l1=l1.next;
        }
        while (l2!=null) {
            int sum=l2.val+carry;
            if(sum>9){
                temp.next=new ListNode(sum%10);
                carry=sum/10;
                temp=temp.next;
            }
            else{
                temp.next=new ListNode(sum);
                carry=0;
                temp=temp.next;
            }
            l2=l2.next;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return head.next;
    }

}
