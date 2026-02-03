package com.vanh.L6_stream;

import java.util.stream.Collectors;

public class Chars {
    public static void main(String[] args) {
        String str = "abcdefg";

        str = str.chars().peek(c -> System.out.println(c)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();


    }
}
