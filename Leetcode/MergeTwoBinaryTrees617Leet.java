public class MergeTwoBinaryTrees617Leet {
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
    TreeNode merge(TreeNode root1, TreeNode root2){
        if(root1!=null && root2!=null){
            TreeNode merged=new TreeNode(root1.val+root2.val);
            merged.left=merge(root1.left, root2.left);
            merged.right=merge(root1.right, root2.right);
            return merged;
        }
        else if(root1!=null){
            TreeNode merged=new TreeNode(root1.val);
            merged.left=merge(root1.left, null);
            merged.right=merge(root1.right, null);
            return merged;
        }
        else if(root2!=null){
            TreeNode merged=new TreeNode(root2.val);
            merged.left=merge(root2.left, null);
            merged.right=merge(root2.right, null);
            return merged;
        }
        return null;
    }
}
