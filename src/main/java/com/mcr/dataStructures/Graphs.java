package com.mcr.dataStructures;

public class Graphs {

    /// A graph is some connections between nodes/vertex and the connections are called edges.
    /// There are two types of graphs directed graph and undirected graph.
    ///
    /// An un-directed graph can be an example for a social network, because a single node can have network with as
    /// many as nodes/vertex. ex: facebook
    /// (The connections are not pointed)
    ///
    /// A directed graph can be an example for a directions in map where the direction can be used to show either the
    /// roads are one-way or two-way, they are not necessarily needs to be two-way. ex: map
    /// (The connections are pointed)
    ///
    /// Adjacency: In un-directed graph if there is an edge between A and B, means A is adjacent to B and B is adjacent
    ///            to A.
    ///            In directed graph if there is a directed edge form A to B means A is adjacent to B but doesn't mean
    ///            that B is adjacent to A unless there is also a directed edge form B to A.
    ///
    /// There are two ways to represent a graph:
    /// 1. Adjacency matrix:
    ///    We can create a 2D array or 2D array list, one column and or row for each node.
    ///    if there is an adjacency between two nodes we will mark "one" in the box where the two nodes meet and if
    ///    there is no adjacency, we will mark it as "zero".
    ///    Run-time complexity -> O(1) constant time
    ///    Space complexity -> O(v^2) quadratic space
    ///    It's very quick to look up an edge, but consumes more space.
    ///
    /// 2. Adjacency list:
    ///    It's an array or array list of linked list. Each element is a separate linked list and each header in the
    ///    linked list contains the address of a node.
    ///    If there is an adjacency between two node, we will add the adjacent node to the linked list of which ever
    ///    node it is adjacent to, so that node contains the address of the adjacent node.
    ///    Run-time complexity -> O(V) linear time
    ///    Space complexity -> O(V + E)
    ///    It consumes less space, but takes linear time to look up since the adjacency is stored as a linked list.

}
