package com.vanh.L6_stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Reduction {
    public static void main(String[] args) {
        String[] strings = "this is an array of strings".split(" ");

        long count = Arrays.stream(strings).count();

        OptionalDouble average = Arrays.stream(strings).mapToInt(String::length).average();

        OptionalInt max = Arrays.stream(strings).mapToInt(String::length).max();

        OptionalInt min = Arrays.stream(strings).mapToInt(String::length).min();

        System.out.println(average);
        System.out.println(max);
        System.out.println(min);


        int sum = IntStream.rangeClosed(1,10)
                .reduce((x,y) -> x + y).orElse(0);
        System.out.println(sum);
    }
}
