public class CountTree222Leet {
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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    /*public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
    
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
    
        if (leftHeight == rightHeight) {
            // If the left subtree is a perfect binary tree, its number of nodes is 2^leftHeight - 1
            // Using the formula (2^height) = (int) Math.pow(2, height)
            return (int) Math.pow(2, leftHeight) + countNodes(root.right);
        } else {
            // If the right subtree is a perfect binary tree, its number of nodes is 2^rightHeight - 1
            return (int) Math.pow(2, rightHeight) + countNodes(root.left);
        }
    }
    
    private int getHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }*/
}
