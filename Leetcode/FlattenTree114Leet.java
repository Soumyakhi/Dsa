import java.util.ArrayList;

public class FlattenTree114Leet {
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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> al=new ArrayList<>();   
        preOrder(root,al);
        al.add(null);
        for(int i=0;i<al.size();i++){
            al.get(i).left=null;
            al.get(i).right=al.get(i+1);
        }
        
    }
    void preOrder(TreeNode root,ArrayList<TreeNode> al){
        if(root==null){
            return;
        }
        al.add(root);
        preOrder(root.left,al);
        preOrder(root.right,al);
    }
}
