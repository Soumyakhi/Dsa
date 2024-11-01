import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder102Leet {
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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        if(root==null){
            return al;
        }
        ArrayList<Integer> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode currNode=q.remove();
            if(currNode==null){
                al.add(ls);
                ls=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
                ls.add(currNode.val);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            
        }
        
        return al;
    }
}
