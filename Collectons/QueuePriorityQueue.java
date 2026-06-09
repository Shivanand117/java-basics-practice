package Collectons;

import java.util.PriorityQueue;

public class QueuePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //Queue Methods
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        //collection methid
        pq.add(20);
        System.out.println("Elements : "+pq);

        //queue methods
        System.out.println("Peek():"+ pq.peek());

        //collecton method
        System.out.println("contains(30): "+ pq.contains(30));

        //queue Method
        System.out.println("Poll(): "+pq.poll());
        System.out.println("After Poll()"+ pq);
        //collection Method
        System.out.println("size(): "+pq.size());
        System.out.println("isEmpty(): "+pq.isEmpty());
        pq.clear();
        System.out.println("After Clear():"+pq);
    }
}
