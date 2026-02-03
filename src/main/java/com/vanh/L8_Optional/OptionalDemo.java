package com.vanh.L8_Optional;

import java.util.Optional;

/*
* Optional is a wrapper for value that may or may not be present
*   -> Purpose: force you to handle null value and avoid null pointer exception

    * Common method:
    *   isPresent
    *   get
* * */
public class OptionalDemo {

    public static void main(String[] args) {
        // Optional.empty() means an optional object that has nothing
        System.out.println(Optional.empty());

        // Optional.of(VALUE)  means that value must always be not null
            String a = "hello";
            System.out.println(Optional.of(a)); // a must not be null


        // Optional.ofNullable(VALUE) means that value can be null or not null but we should handle null case
        String b = null;
        System.out.println(Optional.ofNullable(b).orElse("this is alternative b")); // can be null
    }
}
