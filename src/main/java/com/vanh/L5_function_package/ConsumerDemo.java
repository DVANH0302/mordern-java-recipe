package com.vanh.L5_function_package;


import java.util.List;
import java.util.function.Consumer;

/*
*  Consumer interface Take 1 argument and return nothing
    void accept(T t);
* * */
public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);


        // anonymous method
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });
        System.out.println();

        // lambda
        list.forEach(item -> System.out.print(item));
        System.out.println();


        // method reference
        list.forEach(System.out::print);

    }
}
