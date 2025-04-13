package com.mcr.dataStructures.adjacencyMatrix;

public class Main {

    /// A 2D array to store 0's and 1's to represent edges.
    /// number of rows and number of columns depends on unique number of nodes/vertices.
    ///
    /// run-time complexity -> O(1) constant time (to check an edge)
    /// space complexity -> O(v^2)

    public static void main(String[] args) {

        Graph graph = new Graph(5);
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
    }
}
