public class KthSmallestBST230Leet {
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
    int count=1;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return this.val;
    }
    void inorder(TreeNode root,int k){
        if(root==null){
            return; 
        }
        inorder(root.left, k);
        if(this.count==k){
            
            val=root.val;
            return;
        }
        this.count++;
        inorder(root.right, k);
    }
}
