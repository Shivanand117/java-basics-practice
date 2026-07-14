package Collectons.LinkedListDemo;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
       this.data=data;
       this.prev=null;
       this.next=null;
    }
}

class DoublyLinkedlist{
    Node head;
    Node tail;
    int size;

   DoublyLinkedlist() {
    head=null;
    tail=null;
    size=0;
   }

   //Add First
   public void addFirst(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=newNode;
        tail=newNode;
    }else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    size++;
   }

   public void allLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
    }
    else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    size++;
   }

   //Display forward
   public  void displayForward(){
    Node temp=head;

    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
   }

//display backward

public void displayBackward(){
    Node temp=tail;

    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.prev;
    }
    System.out.println();
}
}


public class DoublyLinkedList {
    public static void main(String[] args) {
        
    }
}
