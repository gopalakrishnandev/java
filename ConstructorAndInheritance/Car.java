package com.example.ConstructorAndInheritance;

public class Car extends Bike {
    public Car() {
        // no args constructor
        super("no args");
        System.out.println("car class constructor");
    }

}
