import java.util.ArrayList;
import java.util.Collections;

public class MinimumAbsoluteDiff530Leet {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
        public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        printTreeInOrder(root, al);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++){
            mindiff=Math.min(mindiff,al.get(i+1)-al.get(i));
        }
        return mindiff;
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
