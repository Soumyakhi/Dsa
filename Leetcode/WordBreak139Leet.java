import java.util.ArrayList;
import java.util.HashMap;

public class WordBreak139Leet {
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
    boolean wordBreaks(Node root, String key,HashMap<String, Boolean> memo) {
        if (key.length() == 0) {
            return true;
        }
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0, i);
            String second = key.substring(i);
            if (search(root, first) && wordBreaks(root, second,memo)) {
                memo.put(key, true);
                return true;
            }
        }
        memo.put(key, false);
        return false;
    }
    public boolean wordBreak(String s, ArrayList<String> wordDict) {
        Node root=new Node();
        WordBreak139Leet tr=new WordBreak139Leet();
        for (String string : wordDict) {
            tr.insert(root,string);
        }
        return tr.wordBreaks(root, s,new HashMap<>());
    }
    public static void main(String[] args) {
        
    }
    
}
