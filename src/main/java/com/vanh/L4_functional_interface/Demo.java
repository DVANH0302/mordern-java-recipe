package com.vanh.L4_functional_interface;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface isOddNumber {
    boolean checkOdd(int number);
}



public class Demo {
    /*
    * - Functional interfaces are interfaces : 1 abstract method + default methods + static methods
    * */

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        isOddNumber isOddNumber = n -> n % 2 == 1;

        List<Integer> oddList = list.stream().filter(isOddNumber::checkOdd).collect(Collectors.toList());

        System.out.println(oddList);
    }


}
