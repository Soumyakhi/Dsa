import java.util.ArrayList;

public class RecoverBST99Leet {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> al=new ArrayList<>();
        TreeNode prev=null,last=null;
        printTreeInOrder(root, al);
        System.out.println(al);
        for(int i=1;i<al.size();i++){
            if(((al.get(i)).val<(al.get(i-1)).val)){
                prev=al.get(i-1);
                break;
            }
        }
        for(int i=1;i<al.size();i++){
            if(((al.get(i)).val<(al.get(i-1)).val)){
                last=al.get(i);
            }
        }
        int temp=prev.val;
        prev.val=last.val;
        last.val=temp;

    }
    void printTreeInOrder(TreeNode root,ArrayList<TreeNode> al) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left,al);
        al.add(root);
        printTreeInOrder(root.right,al);

    }
    TreeNode insert(TreeNode root,int val){
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
