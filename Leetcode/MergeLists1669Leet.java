public class MergeLists1669Leet {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1,tempFirst=null,tempLast=null;
        int count=0;
        while (temp!=null) {
            if(count==a-1){
                tempFirst=temp;
            }
            if(count==b+1){
                tempLast=temp;
            }
            temp=temp.next;
            count++;
        }
        tempFirst.next=list2;
        temp=list2;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=tempLast;
        return list1;
    }
}
