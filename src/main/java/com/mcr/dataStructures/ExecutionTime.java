package com.mcr.dataStructures;

public class ExecutionTime {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.nanoTime();

        Thread.sleep(4000);

        long duration = (System.nanoTime() - startTime) / 1000000;
        System.out.println(duration + "ms");
    }
}
