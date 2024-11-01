import java.util.HashMap;
import java.util.HashSet;

import org.w3c.dom.Node;

public class TargetNode1379Leet {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode temp=cloned;
        return inOrder(temp,target);
    }
    TreeNode inOrder(TreeNode root,TreeNode target) {
        if (root == null) {
            return null;
        }
        if(root.val==target.val){
            return root;
        }
        if (inOrder(root.left, target)!=null) {
            return inOrder(root.left, target);
        }
        return inOrder(root.right,target);
        
    }
}
