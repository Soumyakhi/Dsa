import java.util.HashMap;

public class BinaryTreeFromPreAndInorder105Leet {
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
    HashMap<Integer,Integer> inOrderMap=new HashMap<>();
    int preOrderIndex=0; 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        TreeNode head=buildTreeUtil(preorder, 0, preorder.length-1);
        return head;
    }
    TreeNode buildTreeUtil(int []preorder,int start,int end){
        if(start>end){
            return null;
        }
        int preElement=preorder[preOrderIndex++];
        int inorderIndex=inOrderMap.get(preElement);
        TreeNode headNode=new TreeNode(preElement);
        headNode.left=buildTreeUtil(preorder,start, inorderIndex-1);
        headNode.right=buildTreeUtil(preorder, inorderIndex+1,end);
        return headNode;
    }
}
