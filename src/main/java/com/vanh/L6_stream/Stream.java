package com.vanh.L6_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        java.util.stream.Stream<String> a = java.util.stream.Stream.of("1", "2", "2");

        List<String> b = a.filter(item -> item.equals("1")).collect(Collectors.toList());

        System.out.println(b);

        java.util.stream.Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);


    }

}
