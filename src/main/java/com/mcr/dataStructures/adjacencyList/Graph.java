package com.mcr.dataStructures.adjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> aList;

    Graph() {
        aList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        Node dstNode = aList.get(dst).get(0);
        aList.get(src).add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        for(Node node : aList.get(src)) {
            if (node == aList.get(dst).get(0)) return true;
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> nodeList : aList) {
            for (Node node : nodeList) {
                System.out.print(node.data + "\t->\t");
            }
            System.out.println();
        }
    }

}
