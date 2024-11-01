class TreeNode {
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
public class Pruning814Leet {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.val!=1 && (printTreeInOrder(root)==false)){
            return null;
        }
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        return root;
    }
    boolean printTreeInOrder(TreeNode root) {
        if (root == null) {
            return false;
        }
        if(root.val==1){
            return true;
        }
        return printTreeInOrder(root.left)||printTreeInOrder(root.right); 
    }
}
