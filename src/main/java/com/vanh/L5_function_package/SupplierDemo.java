package com.vanh.L5_function_package;

import java.util.function.DoubleSupplier;

/*
* Take no argument and return a generic type
*  T get()
* */
public class SupplierDemo {

    public static void main(String[] args) {

        //anonymous class
        DoubleSupplier randomSupplierAnonymous = new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return Math.random();
            }
        };

        // lambda
        DoubleSupplier randomSupplierLambda = () -> Math.random();

        // method reference
        DoubleSupplier randomSupplierMethodReference = Math::random;

        System.out.println(randomSupplierAnonymous.getAsDouble());
        System.out.println(randomSupplierLambda.getAsDouble());
        System.out.println(randomSupplierMethodReference.getAsDouble());
    }

}
