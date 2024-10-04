import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
   
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        idx=-1;
        //Node root2 = buildTree(nodes);
        System.out.println("Preorder:");
        printTreePreOrder(root);
        //printTree(root2);
        System.out.println();
        System.out.println("Inorder:");
        printTreeInOrder(root);
        System.out.println();
        System.out.println("Postorder:");
        printTreePostOrder(root);
        System.out.println();
        System.out.println("Levelorder:");
        levelOrder(root);
        System.out.println("Count of Nodes: "+countNodes(root));
        System.out.println("Sum of Nodes: "+sumNodes(root));
        System.out.println("Height of Tree: "+height(root));
        System.out.println("Diameter of Tree: "+diameter(root));
        System.out.println("Diameter of Tree O(n): "+diameter2(root).diam);

    }
    public static void levelOrder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            
        }
    }

    public static void printTreePreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
        
    }
    public static void printTreeInOrder(Node root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.data + " ");
        printTreeInOrder(root.right);
        
    }
    public static void printTreePostOrder(Node root) {
        if (root == null) {
            return;
        }
        printTreePostOrder(root.left);
        printTreePostOrder(root.right);
        System.out.print(root.data + " ");
        
    }
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }
    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left=sumNodes(root.left);
        int right=sumNodes(root.right);
        return left+right+root.data;
    }
    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int left=diameter(root.left);
        int right=diameter(root.right);
        int height=height(root.left)+height(root.right)+1;
        return Math.max(Math.max(left,right),height);
    }
    static class TreeInfo{
        int ht,diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    
    static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int height=Math.max(left.ht, right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int diam= Math.max(Math.max(diam1,diam2),diam3);
        return new TreeInfo(height,diam);
    }

    
}