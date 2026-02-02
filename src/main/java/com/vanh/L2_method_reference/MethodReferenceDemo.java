package com.vanh.L2_method_reference;

import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> list= List.of("hello","world", "jds;kljfa;", "a", "ffasdf", "ada");
        list.stream().map(String::length).sorted((a, b) -> a-b).forEach(System.out::println);
    }

}
