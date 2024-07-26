package Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie_structure {
    public class trienode{
        Map<Character,trienode> child=new HashMap<>();
        boolean endword=false;
    }
    public trienode root;
    public Trie_structure(){
        root=new trienode();
    }
    public void insert(String word){
        trienode node=root;
        for (char i:word.toCharArray()){
            node.child.putIfAbsent(i,new trienode());
            node=node.child.get(i);
        }
        node.endword=true;
    }
    public boolean search(String word){
        trienode node=root;
        for (char i:word.toCharArray()){
            node=node.child.get(i);
            if (node==null){
                return false;
            }
        }
        return node.endword;
    }
    public boolean Prefix_search(String word){
        trienode node=root;
        for (char i:word.toCharArray()){
            node=node.child.get(i);
            if (node==null){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Trie_structure trie=new Trie_structure();
        trie.insert("apple");
        System.out.println(trie.search("app")); 
        System.out.println(trie.search("apple"));
        System.out.println(trie.Prefix_search("app"));
    }
}
