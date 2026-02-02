package com.vanh.L3_constructor_reference;

import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {


        List<String> names = List.of("A", "B", "C");

        List<Person> people = names.stream().map(Person::new).collect(Collectors.toList());

        List<Person> p2 = names.stream().map(name -> new Person(name)).collect(Collectors.toList());

        System.out.println(people);
        System.out.println(p2);
    }
}
