package com.mcr.dataStructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // LIFO Data Structure.
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Clash of Clans");
        stack.push("Pubg");
        stack.push("Free Fire");
        stack.push("Mini Militia");
//        System.out.println(stack.empty());
        System.out.println(stack);
//
//        String favGame = stack.pop();
//        System.out.println(favGame);
//
//        System.out.println(stack);

//        System.out.println(stack.peek());
//        System.out.println(stack);

//        System.out.println(stack.search("Free Fire"));

//        causes  OutOfMemoryError
//        for (int i = 0; i < 1000000000; i++) {
//            stack.push("Stick Man");
//        }
    }
}
