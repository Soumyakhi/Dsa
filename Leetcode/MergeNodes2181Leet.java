import java.util.ArrayList;

public class MergeNodes2181Leet {
    class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode mergeNodes(ListNode head) {
        
        ArrayList<ListNode> al=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        ListNode temp=head;
        while (temp!=null) {
            al.add(temp);
            temp=temp.next;
        }
        for(int i=0;i<al.size();i++){
            if(al.get(i).val==0){
                int sum=0,k=i+1;
                while (k<al.size() && al.get(k).val!=0) {
                    sum+=al.get(k).val;
                    k++;
                }
                res.add(sum);
                i=k;
            }
        }
        MergeNodes2181Leet.ListNode head2=new ListNode(-50);
        temp=head2;
        for (Integer integer : res) {
            temp.next=new ListNode(integer);
            temp=temp.next;
        }
        return head2.next;
    }
}
