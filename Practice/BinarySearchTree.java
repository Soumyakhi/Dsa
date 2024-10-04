import java.util.ArrayList;
public class BinarySearchTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static Node insert(Node root,int val){
        if (root == null) {
            return new Node(val);
        }
        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    static void printTreeInOrder(Node root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.val + " ");
        printTreeInOrder(root.right);
        
    }
    static boolean find(Node root,int key) {
        if (root == null) {
            return false;
        }
        if(key==root.val){
            return true;
        }
        if(key<root.val){
            return find(root.left, key);
        }
        return find(root.right, key);
    }
    static Node delete(Node root,int key) {
        if(root==null){
            return null;
        }

        if(key<root.val){
            root.left=delete(root.left, key);
        }
        else if(key>root.val)
        {
            root.right=delete(root.right, key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node changed=inOrdMost(root.right);
            root.val=changed.val;
            root.right=delete(root.right, changed.val);
        }
        return root;
    }
    static Node inOrdMost(Node root){
        if(root.left==null){
            return root;
        }
        return inOrdMost(root.left);
    }
    static void traverse(Node root,int start,int end){
        if(root==null){
            return;
        }
        if(root.val>=start && root.val<=end){
            traverse(root.left, start, end);
            System.out.println(root.val);
            traverse(root.right, start, end);
        }
        else if(root.val>end){
            traverse(root.left, start, end);
        }
        else if(root.val<start){
            traverse(root.right, start, end);
        }
        return;
    }
    static void printRootToLeaf(Node root,ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        if(root.left==null && root.right==null){
            System.out.println(al);
        }
        else{
            printRootToLeaf(root.left,al);
            printRootToLeaf(root.right,al); 
        }  
        al.remove(al.size()-1); 
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i : values) {
            root=insert(root, i);
        }
        printTreeInOrder(root);
        System.out.println();
        System.out.println(find(root, 3));
        delete(root, 1);
        printTreeInOrder(root);
        System.out.println();
        traverse(root, 2, 4);
        System.out.println("root to leaf");
        printRootToLeaf(root, new ArrayList<Integer>());
    }
    
}
