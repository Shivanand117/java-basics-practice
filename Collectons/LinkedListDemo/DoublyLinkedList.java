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

   public void addLast(int data){
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

//delete first
public void deleteFirst(){
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    if(head==tail)
        head=tail=null;
    else
        head=head.next;
       head.prev=null;
       size--;
}
//deletelast method

public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head==tail)
        head=tail=null;
    else
        tail=tail.prev;
        tail.next=null;

        size--;
}
public boolean search(int key){
    Node temp=head;
    while(temp!=null){
        if(temp.data==key){
            return true;
        }
        temp=temp.next;
    }
    return false;
}

public void inseertAtPosition(int pos,int data){
    if(pos<1 || pos>size+1){
        System.out.println("Invalid Position");
        return;
    }
    if(pos==1){
        addFirst(data);
        return;
    }
    if(pos==size+1){
        addLast(data);
        return;
    }
    Node temp=head;

    for(int i=1;i<pos-1;i++){
        temp=temp.next;
    }
    Node newNode =new Node(data);
    newNode.next=temp.next;
    newNode.prev=temp;

    temp.next.prev=newNode;
    temp.next=newNode;

    size++;
}

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        
    }
}
