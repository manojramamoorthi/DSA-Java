package Trie;

import java.util.ArrayList;
import java.util.List;

class trienode {
    trienode[] child;
    boolean endWord=false;
    trienode(){
        child=new trienode[26];
        endWord=false;
    }
}
public class Trie_da {
    public trienode root;
    Trie_da(){
        root=new trienode();
    }
    public void insert(String data){
        trienode node=root;
        for (char i:data.toCharArray()){
            if (node.child[i-'a']==null){
                node.child[i-'a']=new trienode();
            }
            node=node.child[i-'a'];
        }
        node.endWord=true;
    }
    public void display_all(){
        List<String> result=new ArrayList<>();
        collect(root,new StringBuilder(),result);
        for(String c:result){
            System.out.println(c);
        }
    }

    private void collect(trienode node, StringBuilder prefix,List<String> result) {
        if (node.endWord){
            result.add(prefix.toString());
        }
        for (int i=0;i<26;i++){
            if (node.child[i] != null) {
                prefix.append((char) (i+'a'));
                collect(node.child[i],prefix,result);
                prefix.deleteCharAt(prefix.length()-1);
            }
        }
    }
    public static void main(String[] args){
        Trie_da trie=new Trie_da();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        trie.insert("ball");
        trie.display_all();
    }
}
