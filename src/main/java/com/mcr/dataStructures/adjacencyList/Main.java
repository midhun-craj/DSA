package com.mcr.dataStructures.adjacencyList;

public class Main {

    /// An Array/ArrayList of Linked Lists.
    /// Each linked list has a unique node at the head.
    /// All adjacent neighbours to that node are added to that node's linked list.
    ///
    /// run-time complexity -> O(v) linear time (to check an edge)
    /// space complexity -> O(v + e)

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(1, 2));
    }
}
