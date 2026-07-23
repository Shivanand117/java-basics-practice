package Collectons;

public class QueueArray {

    int[] arr;
    int front;
    int rear;
    int size;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Insert
    public void enqueue(int data) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    // Remove
    public int dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return arr[front++];
    }

    // Front element
    public int peek() {

        if (front == -1 || front > rear) {
            return -1;
        }

        return arr[front];
    }

    // Empty or not
    public boolean isEmpty() {

        return front == -1 || front > rear;
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println(q.dequeue());

        q.display();

        System.out.println(q.peek());

    }
}