import java.util.HashMap;

public class BinaryTreeFromPostAndInorder106Leet {
    HashMap<Integer,Integer> inOrderMap=new HashMap<>();
    int postorderIndex=0; 
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        this.postorderIndex=postorder.length-1;
        TreeNode head=buildTreeUtil(postorder, 0, postorder.length-1);
        return head;
    }
    TreeNode buildTreeUtil(int []postorder,int start,int end){
        if(start>end){
            return null;
        }
        int postElement=postorder[postorderIndex--];
        int inorderIndex=inOrderMap.get(postElement);
        TreeNode headNode=new TreeNode(postElement);
        headNode.right=buildTreeUtil(postorder, inorderIndex+1,end);
        headNode.left=buildTreeUtil(postorder,start, inorderIndex-1);
        return headNode;
    }
}
