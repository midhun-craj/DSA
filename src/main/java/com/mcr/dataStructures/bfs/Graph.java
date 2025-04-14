package com.mcr.dataStructures.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return (matrix[src][dst] == 1);
    }

    public void print() {
        for(Node node : nodes) {
            System.out.print("\t" + node.data);
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + "\t");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void breadFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(!queue.isEmpty()) {
            src = queue.poll();
            System.out.println(nodes.get(src).data + "\t=\tVisited");

            for(int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
