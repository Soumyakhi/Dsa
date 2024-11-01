import java.util.HashMap;

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
public class HouseRobberIII337Leet {
    public int rob(TreeNode root) {
        return maxLoot(root,new HashMap<>());
    }
    int maxLoot(TreeNode root,HashMap<TreeNode,Integer> hm){
        if(root==null){
            return 0;
        }
        if(hm.containsKey(root)){
            return hm.get(root);
        }
        //include
        int inc=root.val;
        if(root.left!=null){
            inc+=maxLoot(root.left.left,hm)+maxLoot(root.left.right,hm);
        }
        if(root.right!=null){
            inc+=maxLoot(root.right.left,hm)+maxLoot(root.right.right,hm);
        }
        //exclude
        int exc=maxLoot(root.left,hm)+maxLoot(root.right,hm);
        int res=Math.max(inc, exc);
        hm.put(root, res);
        return res;
    }
}
