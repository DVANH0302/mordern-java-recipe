package com.vanh.L6_stream;

import java.util.stream.IntStream;

/*
* A way to debug
* */
public class Peek {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10)
                .filter(n -> n% 2 == 0)
                .peek(n -> System.out.println(n))
                .reduce(0, (a,b) -> a + b);
        System.out.println();
        System.out.println(sum);
    }
}
