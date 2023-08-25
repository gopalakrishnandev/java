package com.example.SuperandThis;

class Superclass {
    Superclass() {
        System.out.println("Superclass constructor");
    }
}

class Subclass extends Superclass {
    Subclass() {
        super(); // Explicitly calling the superclass constructor
        System.out.println("Subclass constructor");
    }
}

public class SuperandThis2 {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        // Explicitly calling the superclass constructor
    }
}