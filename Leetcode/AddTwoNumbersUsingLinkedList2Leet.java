import java.util.LinkedList;

public class AddTwoNumbersUsingLinkedList2Leet {
    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int sum1=0,sum2=0;
        for (Integer list : l1) {
            sum1=sum1*10+list;
        }
        for (Integer list : l2) {
            sum2=sum2*10+list;
        }
        int sum3=sum1+sum2;
        String sums=Integer.toString(sum3);
        LinkedList<Integer> ln=new LinkedList<>();
        for(int i=0;i<sums.length();i++){
                ln.add(Character.getNumericValue(sums.charAt(i)));
        }
        return ln;
    }
    public static void main(String[] args) {
        AddTwoNumbersUsingLinkedList2Leet aTN=new AddTwoNumbersUsingLinkedList2Leet();
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        for (Integer list : aTN.addTwoNumbers(l1, l2)) {
            System.out.println(list);
        }
    }
}

