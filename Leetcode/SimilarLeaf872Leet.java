import java.util.ArrayList;

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
public class SimilarLeaf872Leet {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        dfs(root1, al1);
        dfs(root2, al2);
        if(al1.size()!=al2.size()){
            return false;
        }
        for(int i=0;i<al1.size();i++){
            if(!al1.get(i).equals(al2.get(i))){
                return false;
            }
        }
        return true;
    }
    void dfs(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            al.add(root.val);
            return;
        }
        dfs(root.left, al);
        dfs(root.right, al);
    }
}
