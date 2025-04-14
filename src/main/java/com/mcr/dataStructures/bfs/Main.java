package com.mcr.dataStructures.bfs;

public class Main {

    /// A search algorithm for traversing a tree or graph data structure.
    /// This is done one "level" at a time rather than one "branch" at a time.
    ///
    /// Breadth FS -> Traverse a graph level by level.
    ///               Utilizes a queue.
    ///               Better if destination is on average close to start.
    ///               Siblings are visited before children.
    ///
    /// Depth FS -> Traverse a graph branch by branch.
    ///             Utilizes a stack.
    ///             Better if destination is on average far from the start.
    ///             Children are visited before siblings.
    ///             More popular for games/puzzles.

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

        graph.breadFirstSearch(0);
    }
}
