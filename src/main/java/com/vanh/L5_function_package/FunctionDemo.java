package com.vanh.L5_function_package;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* Take 1 argument and return a new generic type
*   R apply(T t)
* */
public class FunctionDemo {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");

        List<String> upperStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperStrings);
    }

}
