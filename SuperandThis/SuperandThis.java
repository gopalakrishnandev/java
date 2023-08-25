package com.example.SuperandThis;

class Superclass {
    int x = 10;

    void display() {
        System.out.println("Superclass display");
    }
}

class Subclass extends Superclass {
    int x = 20;

    void display() {
        System.out.println("Subclass display");
    }

    void show() {
        System.out.println("Subclass show");
        System.out.println("Subclass x: " + x); // Accessing subclass x
        System.out.println("Superclass x: " + super.x); // Accessing superclass x
        super.display(); // Calling superclass method
    }
}

public class SuperandThis {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.show();
    }
}