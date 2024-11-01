import java.util.ArrayList;

public class SortedArrayToBsT108Leet {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=null;
        if(nums.length<3){
            for (int i : nums) {
                root=insert(root,i);
            }
            return root;
        }
        ArrayList<Integer> al=new ArrayList<>();
        int begin=0,end=nums.length-1;
        ins(al,nums,begin,end);
        for (Integer integer : al) {
            root=insert(root, integer);
        }
        return root;
    }
    void ins(ArrayList<Integer> al,int[] nums,int begin,int end){
        if(end<begin){
            return;
        }
        else{
            int mid=(begin+end)/2;
            al.add(nums[mid]);
            ins(al, nums, begin, mid-1);
            ins(al, nums, mid+1, end);
        }
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
