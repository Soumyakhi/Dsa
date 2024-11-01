import java.util.ArrayList;

public class AllElements1305Leet {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public ArrayList<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        printTreeInOrder(root1, al1);
        printTreeInOrder(root2, al2);
        for (Integer integer : al2) {
            if(al1.indexOf(integer)!=-1){
                al2.remove(integer);
            }
        }
        ArrayList<Integer> al3=new ArrayList<>();
        int index1=0,index2=0;
        while (index1<al1.size() && index2<al2.size()) {
            if(al1.get(index1)<al2.get(index2)){
                al3.add(al1.get(index1));
                index1++;
            }
            else{
                al3.add(al2.get(index2));
                index2++;
            }
        }
        while (index1<al1.size()) {
            al3.add(al1.get(index1++));
        }
        while (index2<al2.size()) {
            al3.add(al2.get(index2++));
        }
        return al3;
    }
    void printTreeInOrder(TreeNode root,ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left,al);
        al.add(root.val);
        printTreeInOrder(root.right,al);

    }
}
