package com.vanh.L3_constructor_reference;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyConstructorReferenceDemo {
    public static void main(String[] args) {
        Person before = new Person("Andy");

        // Person class must have the copy constructor Person(Person other)
        List<Person> people = Stream.of(before).map(Person::new).collect(Collectors.toList());

        before.setName("Jack");
        Person after = people.get(0);
        System.out.println(before);
        System.out.println(after);
    }
}
