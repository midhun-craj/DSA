package com.mcr.dataStructures.bst;

public class Main {

    /// Binary tree is a tree in which each node has a maximum of two children.
    /// Binary search tree is a tree in which, where each node is greater that it's left node but less than it's right
    /// node.
    ///
    /// easy to locate a node when they are in this order.
    ///
    /// run-time complexity -> best case O(log n) logarithmic time
    ///                        worst case O(n) linear time
    ///
    /// space complexity -> O(n) linear space
    ///
    /// The time complexity depends on how balanced the tree is, it can be unbalanced like skewed left or right,
    /// to make it balanced we make use of rotations, which is another topic called "AVL tree", in case of avl tree
    /// the time complexity can be O(log n) but in case of a normal binary search tree it can vary, that's why it has
    /// worst case of O(n) time complexity.
    /// which means every node should keep the balance factor value in range of -1, 0, 1 to be balanced, which makes an
    /// AVL tree,
    ///
    /// Balance factor = height(left subtree) - height(right subtree)

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

//        tree.remove(0);

        tree.display();
//        System.out.println(tree.search(1));

    }
}
