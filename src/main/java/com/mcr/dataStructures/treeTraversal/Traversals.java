package com.mcr.dataStructures.treeTraversal;

public class Traversals {

    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    // Used for traversing the bst in ascending order.
    public void inorder() {
        inorderHelper(root);
    }

    private void inorderHelper(Node root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.println(root.data);
            inorderHelper(root.right);
        }
    }

    // Used for traversing the bst in each node which it visits first, that is it marks every node which it visits
    // first before moving to its child nodes.
    // Used for copying the entire bst
    public void preorder() {
       preOrderHelper(root);
    }

    private void preOrderHelper(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }
    }

    // Used for traversing each subtree form the bst from each level, starting from the leaf node.
    public void postorder() {
        postOrderHelper(root);
    }

    private void postOrderHelper(Node root) {
        if (root != null) {
            postOrderHelper(root.left);
            postOrderHelper(root.right);
            System.out.println(root.data);
        }
    }
}
