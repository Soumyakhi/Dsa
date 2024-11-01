import java.util.HashSet;

public class LinkedListComponents817Leet {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int count=0;
        ListNode temp=head;
        while (temp.next!=null) {
            if(hs.contains(temp.val)){
                ListNode ptr1=temp.next;
                while(ptr1!=null && hs.contains(ptr1.val)){
                    hs.remove(ptr1.val);
                }
                hs.remove(temp.val);
                count++;
            }
            temp=temp.next;
        }
        if(hs.contains(temp.val)){
            hs.remove(temp.val);
            count++;
        }
        return count;

    }
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
