package com.vanh.L6_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* use box method to convert IntStream (primitive stream) to Stream<Integer>
* */
public class Boxed {
    public static void main(String[] args) {

        //box
        List<Integer> list = IntStream.of(3,1,2,3,4).boxed().collect(Collectors.toList());

        //collect (alternative)
        List<Integer> ints = IntStream.of(3,1,2,3,4).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(ints);
    }
}
