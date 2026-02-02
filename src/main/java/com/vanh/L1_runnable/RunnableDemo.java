package com.vanh.L1_runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("hello");
        });
        thread.start();
    }
}
