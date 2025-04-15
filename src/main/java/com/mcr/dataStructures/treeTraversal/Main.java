package com.mcr.dataStructures.treeTraversal;

public class Main {
    public static void main(String[] args) {

        Traversals traversals = new Traversals();
        traversals.insert(new Node(5));
        traversals.insert(new Node(1));
        traversals.insert(new Node(9));
        traversals.insert(new Node(2));
        traversals.insert(new Node(7));
        traversals.insert(new Node(3));
        traversals.insert(new Node(6));
        traversals.insert(new Node(4));
        traversals.insert(new Node(8));

        traversals.inorder();
//        traversals.preorder();
//        traversals.postorder();
    }
}
