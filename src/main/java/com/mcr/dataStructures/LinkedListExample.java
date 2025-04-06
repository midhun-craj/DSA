package com.mcr.dataStructures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // ******************************************************************************************************

        // Singly linked list: each node have the data and the address of the next node.
        // Doubly linked list: each node have the data and the address of both prev and next node.
        // Nodes are stored in non-consecutive memory locations.
        // Elements are linked using pointers | address.

        // When traversing in singly linked list we should always start form the head, because each node
        // only have the address of the next node.

        // When traversing in the doubly linked list we can either start from the head or the tail, since each node
        // has the address of the previous node and the next node. But takes more memory since each node have to
        // store both the addresses.

        // Linked list also implements the Deque, short form for "Double ended queue", so we can either add or remove
        // the element from the head or the tail.

        // In the linked list it takes O(n) time to search the element, because nodes are stored at non-consecutive
        // memory locations, but it takes only O(1) time (constant) to add/remove element form the list, since each
        // node stores only the address of the next node.

        // Advantages?
        // Dynamic data structure (allocates needed memory while running)
        // Insertion and deletion of nodes is easy. O(1)
        // No/Low memory waste.

        // Disadvantages?
        // Greater memory usage. (additional pointer)
        // No random access to the elements. (no index [i])
        // Accessing/Searching elements is more time-consuming. O(n)

        // Uses?
        // Implements stack and queue.
        // GPS navigation.
        // Music playlist.


        // ******************************************************************************************************

        // Linked list as a Stack.
//        LinkedList<String> stack = new LinkedList<String>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//        stack.push("D");
//        stack.push("F");
//        stack.pop();
//        System.out.println(stack);

        // Linked list as a Queue.
//        LinkedList<String> queue = new LinkedList<String>();
//        queue.offer("A");
//        queue.offer("B");
//        queue.offer("C");
//        queue.offer("D");
//        queue.offer("F");
//        queue.poll();
//        System.out.println(queue);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4, "E");
//        linkedList.remove("E");

//        System.out.println(linkedList.indexOf("A"));
//        System.out.println(linkedList.get(4));

//        linkedList.offerFirst("0");
//        linkedList.addFirst("0");

//        linkedList.offerLast("G");
//        linkedList.addLast("G");

//        linkedList.pollFirst();
//        linkedList.removeFirst();

//        linkedList.pollLast();
//        linkedList.removeLast();

//        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.getFirst());

//        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
    }
}
