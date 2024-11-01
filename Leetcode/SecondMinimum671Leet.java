import java.util.ArrayList;
import java.util.HashSet;

public class SecondMinimum671Leet {
    public class TreeNode {
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

    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> hs = new HashSet<>();
        printTreeInOrder(root, hs);
        if(hs.size()<2){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for (Integer integer : hs) {
            min=Math.min(min, integer);
        }
        hs.remove(min);
        min=Integer.MAX_VALUE;
        for (Integer integer : hs) {
            min=Math.min(min, integer);
        }
        return min;
    }
    void printTreeInOrder(TreeNode root,HashSet<Integer> al) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left,al);
        al.add(root.val);
        printTreeInOrder(root.right,al);

    }

}
