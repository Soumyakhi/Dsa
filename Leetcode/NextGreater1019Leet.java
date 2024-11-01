import java.util.Stack;

public class NextGreater1019Leet {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nextLargerNodes(ListNode head) {
        if(head.next==null){
            return new int[]{head.val};
        }
        int size=0;
        ListNode ptr=head;
        Stack<Integer> st=new Stack<>();
        while (ptr!=null) {
            size++;
            st.push(ptr.val);
            ptr=ptr.next;
        }
        int arr[]=new int[size];
        int index=size-2;
        Stack<Integer> st2=new Stack<>();
        st2.push(st.pop());
        while (!st.isEmpty()) {
            int element=st.pop();
            while (!st2.isEmpty()) {
                if(st2.peek()>element){
                    break;
                }
                else{
                    st2.pop();
                }
            }
            if(st2.isEmpty()){
                st2.push(element);
                arr[index--]=0;
            }
            else{
                arr[index--]=st2.peek();
                st2.push(element);
            }
        }
        return arr;
    }
}
