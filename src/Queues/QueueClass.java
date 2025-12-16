package Queues;

import java.util.LinkedList;
import java.util.Queue;

//we use queues when we need to store like answer sheets like that
//we use stack and queues in trees and bfs, dfs
//we use this when we need to convert recursion program into iteration

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //inserting to back and removing from the front
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(11);

        System.out.println(queue.peek());     //peak gives number but doesnt remove from queue,peak means first element of the queue
        System.out.println(queue.remove());   //removes integer from the queue
    }
}
