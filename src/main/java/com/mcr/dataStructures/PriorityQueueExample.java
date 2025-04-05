package com.mcr.dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // A FIFO data structure which serves element with the
        // highest priority first before elements with the lowest priority.

//        Queue<Double> queue = new LinkedList<>();
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(1.0);
//        queue.offer(4.0);
//        queue.offer(3.9);
//
//        while(!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

//        Queue<Double> queue = new PriorityQueue<>();
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(1.0);
//        queue.offer(4.0);
//        queue.offer(3.9);
//
//        while(!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        Queue<String> queue = new PriorityQueue<>();
//        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("F");
        queue.offer("D");
        queue.offer("A");
        queue.offer("C");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
