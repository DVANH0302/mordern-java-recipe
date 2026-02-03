package com.vanh.L6_stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Order {
    private Integer id;

    Order(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public Customer addOrder(Integer orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        return this;
    }

}


public class FlatMap_and_Map {
    public static void main(String[] args) {
        Customer customerA = new Customer("A");
        Customer customerB = new Customer("B");
        Customer customerC = new Customer("C");

        customerA.addOrder(1)
                .addOrder(2)
                .addOrder(3)
                .addOrder(4)
                .addOrder(5);

        customerB.addOrder(1)
                .addOrder(2)
                .addOrder(3)
                .addOrder(4)
                .addOrder(5);

        customerC.addOrder(1)
                .addOrder(2)
                .addOrder(3)
                .addOrder(4)
                .addOrder(5);

        List<Customer> customers = Arrays.asList(customerA, customerB, customerC);


        // 1 element in 1 element out
        // public abstract <R> Stream<R> map(Function<? super T, ? extends R> mapper)
        customers.stream().map(customer -> customer.getOrders()).forEach(System.out::println);

        // 1 element in many elements out
        // public abstract <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
        customers.stream().flatMap(customer -> customer.getOrders().stream()).forEach(System.out::println);

    }
}
