import java.util.HashSet;

public class DeleteLLInArray3217Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        ListNode ptr=new ListNode(-1);
        ptr.next=head;
        ListNode temp=ptr;
        while (temp.next!=null) {
            if(hs.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return ptr.next;
    }
}
