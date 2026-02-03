package com.vanh.L7_Comparator_and_Collector;

import com.vanh.L6_stream.Chars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort {

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);


        // using stream
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> strList = List.of("adsfas", "dfsdf", "daa", "dsfsdsdfsdfsadfsa");

        List<String> sortedStrList = strList.stream().sorted((s1, s2) -> s2.length() - s1.length()).collect(Collectors.toList());
        System.out.println(sortedStrList);

        Map

    }
}
