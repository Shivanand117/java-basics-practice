package Collectons;

import java.util.LinkedList;
import java.util.Queue;

// class  Node{
//     int data;
//     Node left;
//     Node right;

//     public Node(int data) {
//         this.data=data;
//         left=null;
//         right=null;
//     }
// }
public class levelWiseSum {
    public static  void levelWiseSumTree(Node root){
         if(root==null){
            return;
         }
         Queue<Node>q= new LinkedList<>();
         q.offer(root);
         int level=0;

         while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
           for(int i=0;i<size;i++){
            Node current=q.poll();
            sum+=current.data;

            if(current.left!=null){
                q.offer(current.left);
            }
            if(current.right!=null){
                q.offer(current.right);
            }
           }
           System.out.println("Level "+ level+ " Sum = "+ sum);
           level++;
         }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.right = new Node(6);
        levelWiseSumTree(root);
    }
}
