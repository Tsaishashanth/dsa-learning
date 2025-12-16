package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {
    public static void main (String[] args) {
        //in this we can insert and remove from both the sides
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(30);  //so in deque we can add from first
        deque.addLast(40);   // and also we can add from last

        System.out.println(deque.remove(20));
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
