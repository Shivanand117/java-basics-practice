package Collectons;

public class MergeTwoSorted {
    static class  Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
/*Fuction to merge two lists */

public static Node merge(Node l1,Node l2){
    Node dummy=new Node(0);
    Node tail=dummy;
    while(l1!=null && l2!=null){
        if(l1.data<=l2.data){
            tail.next=l1;
            l1=l1.next;
        }else{
            tail.next=l2;
            l2=l2.next;
        }
        tail=tail.next;
    }
    if(l1!=null){
        tail.next=l1;
    }
    if(l2!=null){
        tail.next=l2;
    }
    return dummy.next;
}


//dispay  Function

public static void dispaly(Node head){
    while(head!=null){
        System.out.print(head.data);
        if(head.next!=null){
            System.out.print("-->");
        }
        head=head.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        //First linked list
        Node l1=new Node(1);
        l1.next=new Node(3);
        l1.next.next=new Node(5);

        //Second Linked List
        Node l2=new Node(2);
        l2.next=new Node(4);
        l2.next.next=new Node(6);
       
        //display: 
        System.out.println("List 1: " );
        dispaly(l1);

        System.out.println("List  2:");
        dispaly(l2);

        Node merged=merge(l1, l2);
        System.out.println("Merged List: ");
        dispaly(merged);

    }
}
