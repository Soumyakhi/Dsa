import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindMode501Leet {
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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        printTreeInOrder(root, hm);
        int max[]=new int[1];
        hm.forEach((k, v) ->{
            max[0]=Math.max(max[0], v);
        });
        hm.forEach((k, v) ->{
            if(v==max[0]){
                al.add(k);
            }
        });
        int []arr=new int[al.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }
        return arr;
    }
    void printTreeInOrder(TreeNode root,HashMap<Integer,Integer> hm) {
        if (root == null) {
            return;
        }
        if(hm.containsKey(root.val)){
            hm.put(root.val, hm.get(root.val)+1);
        }
        else{
            hm.put(root.val, 1);
        }
        printTreeInOrder(root.left,hm);
        printTreeInOrder(root.right,hm);
    }
}
