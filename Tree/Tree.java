package Tree;

class node{
    int value;
    node left;
    node right;
    node(int value){
        this.value=value;
        left=null;
        right=null;
    }
}
public class Tree {
    public static void main(String[] args){
        node root=new node(10);
        node a=new node(20);
        node b=new node(30);
        node c=new node(40);
        node d=new node(50);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
    }
}
