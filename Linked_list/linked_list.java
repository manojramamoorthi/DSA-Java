package Linked_list;

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linked_list {
    static node head;
    public void insert(int data){
        node curr =head;
        if (curr ==null){
            head=new node(data);
        }
        else {
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next =new node(data);
        }
    }
    public void display(){
        node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    public void delete(int data){
        node curr=head;
        if(head.data==data){
            head=head.next;
        }
        while(curr.next.data!=data){
            curr=curr.next;
        }

        curr.next=curr.next.next;
    }
    public static void main(String[] args){
        linked_list link = new linked_list();
        link.insert(10);
        link.insert(20);
        link.insert(30);
        link.insert(40);
        link.insert(50);
        link.display();
        link.delete(60);
        link.display();
    }
}
