package com.vanh.L3_constructor_reference;

public class Person {

    private String name;


    public Person(String name) {
        this.name = name;
    }
    public Person(Person other){
        this.name = other.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
