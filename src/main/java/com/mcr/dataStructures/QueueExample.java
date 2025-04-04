package com.mcr.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue FIFO
//        linear data structure
//        used in keyboard buffer, printer queue, linked list, priority queue, bfs

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen"); // Enqueue | add element to the tail position
        queue.offer("John");
        queue.offer("Chad");
        queue.offer("Michel");
//
//        queue.poll(); // Dequeue | remove element from in the head position
//        queue.poll();
//        queue.poll();
//        queue.poll();

//        System.out.println(queue.peek());
        System.out.println(queue);
//
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.contains("Michel"));
    }
}
