import java.util.HashSet;

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
public class TwoSumIv653Leet {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        return findSum(root, hs, k);
    }
    boolean findSum(TreeNode root,HashSet<Integer> hs,int k){
        if(root==null){
            return false;
        }
        if(hs.contains(k-root.val)){
            return true;
        }
        else{
            hs.add(root.val);
            return findSum(root.left, hs, k)||findSum(root.right, hs, k);
        }
    }
}
