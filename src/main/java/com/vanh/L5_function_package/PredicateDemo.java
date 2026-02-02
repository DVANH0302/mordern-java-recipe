package com.vanh.L5_function_package;

/*
* Take 1 argument and return a boolean
*   boolean test(T t)
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");

        List<String> notAStrings = strings.stream().filter(string -> !string.equals("a")).collect(Collectors.toList());

        Predicate<String> equalA =  string -> string.equals("a");
        Predicate<String> equalB = string -> string.equals("b");


        List<String> notAStrings2 = strings.stream().filter(equalA.negate()).collect(Collectors.toList());

        List<String> strings3 = strings.stream().filter(equalA.negate().and(equalB.negate())).collect(Collectors.toList());

    }
}
