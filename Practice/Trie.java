import java.util.PriorityQueue;

public class Trie {
    static class Node{
        Node[] children;
        boolean isEndOfWord;
        Node(){
            this.children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            this.isEndOfWord=false;
        }
    }
    void insert(Node root,String word){
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx]=new Node();
            }
            if(i==word.length()-1){
                root.children[idx].isEndOfWord=true;
            }
            root=root.children[idx];
        }
        
    }
    boolean search(Node root,String word){
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null){
                return false;
            }
            if(i==word.length()-1){
                if(root.children[idx].isEndOfWord!=true){
                    return false;
                }
            }
            root=root.children[idx];
        }
        return true;
    }
    boolean wordBreak(Node root, String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);
            if (search(root, first) && wordBreak(root, second)) {
                return true;
            }
        }
    
        return false;
    }    
    private boolean startswith(Trie.Node root, String word) {
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null){
                return false;
            }
            root=root.children[idx];
        }
        return true;
    }
    int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    boolean searchLong(String word,Node root){
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null || root.children[idx].isEndOfWord!=true){
                return false;
            }
            root=root.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"apple","appa","mango","nissan","cat"};
        Node root=new Node();
        Trie tr=new Trie();
        for (String string : words) {
            tr.insert(root,string);
        }
        //System.out.println(tr.wordBreak(root, "dogcatcats"));
        System.out.println(tr.startswith(root, "app"));
        String s="ababa";
        Node root1=new Node();
        for(int i=0;i<s.length();i++){
            tr.insert(root1,s.substring(i));
        }
        System.out.println(tr.countNodes(root1)-1);
        String wordsarr[]={"a","banana","ap","app","appl","apply","apple"};
        Node root2=new Node();
        for (String string : wordsarr) {
            tr.insert(root2,string);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(b.length()==a.length()){
                return a.compareTo(b);
            }
            return b.length()-a.length();
        });
        for (String string : wordsarr) {
            if(tr.searchLong(string, root2)){
                pq.offer(string);
            }
        }
        if(pq.size()<1){
            System.out.println("empty");
        }
        else{
            System.out.println(pq.poll());
        }
    }
}
