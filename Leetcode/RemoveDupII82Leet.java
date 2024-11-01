import java.util.HashMap;

public class RemoveDupII82Leet {
    class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode deleteDuplicates(ListNode head) {
            ListNode ptr=new ListNode(-100);
            ptr.next=head;
            ListNode temp=ptr;
            ListNode ptr2=head;
            HashMap<Integer,Integer> hm=new HashMap<>();
            while (ptr2!=null) {
                if(hm.containsKey(ptr2.val)){
                    hm.put(ptr2.val, 2);
                }
                else{
                    hm.put(ptr2.val, 1);
                }
                ptr2=ptr2.next;
            }
            while (ptr.next!=null) {
                if(hm.get(ptr.next.val)>=2){
                    ptr.next=ptr.next.next;
                }
                else{
                    ptr=ptr.next;
                }
                
            }
            return temp.next;
            
        }
}
