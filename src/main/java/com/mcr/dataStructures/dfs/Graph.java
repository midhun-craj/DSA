package com.mcr.dataStructures.dfs;

import java.util.ArrayList;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
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
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix[src].length];
        dfsHelper(src, visited);
    }

    public void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + "\t" + "->" + "\t" + "Visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }
}
