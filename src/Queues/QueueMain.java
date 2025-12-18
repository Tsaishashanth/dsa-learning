package Queues;

public class QueueMain {
    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);

        queue.display();
        try {
            System.out.println(queue.remove());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        queue.insert(133);

        queue.display();
    }
}
