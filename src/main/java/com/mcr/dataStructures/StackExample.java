package com.mcr.dataStructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // LIFO Data Structure.
        // used in backtracking algorithms.
        // used in undo redo operations.
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());

        stack.push("Minecraft"); // add elements to the top
        stack.push("Clash of Clans");
        stack.push("Pubg");
        stack.push("Free Fire");
        stack.push("Mini Militia");

        stack.pop(); // remove elements from the top

//        System.out.println(stack.empty());
        System.out.println(stack);
//
//        String favGame = stack.pop();
//        System.out.println(favGame);
//
//        System.out.println(stack);

//        System.out.println(stack.peek()); // can view element in the top of the stack without removing the element.
//        System.out.println(stack);

//        System.out.println(stack.search("Free Fire")); // search if the element is in the stack and give its position.

//        causes  OutOfMemoryError
//        for (int i = 0; i < 1000000000; i++) {
//            stack.push("Stick Man");
//        }
    }
}
