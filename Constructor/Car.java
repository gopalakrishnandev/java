package com.example.Constructor;

public class Car {
    // Custom constructor
    String name;
    String description;

    public Car(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public static void main(String[] args) {
        Car vehicle = new Car("BMW", "Good car");
        System.out.println(vehicle.name);

        Car vehicle2 = new Car("Audi", "Nice car");
        System.out.println(vehicle2.name);

    }
}
