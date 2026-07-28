package Collectons;

import java.util.LinkedList;
import java.util.Queue;

class  Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data=data;
        left=null;
        right=null;
    }
}
public class LevelOrderOR_BFS {
    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }

        Queue<Node>q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node current=q.poll();
            System.out.print(current.data+" ");
            if(current.left!=null){
                q.offer(current.left);
            }
            if(current.right!=null){
               q.offer(current.right);
            }
        }
    
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.right=new Node(6);
        System.out.print("Level order Traversal : ");
        levelOrderTraversal(root);
    }
}
