package com.example.OOP.Polymorphism;

public class MethodOverRiding extends Main {
    // myCat method from Main.java class
    void myCat() {
        System.out.println("Raana");
    }

    public static void main(String[] args) {
        MethodOverRiding obj = new MethodOverRiding();
        obj.myCat();
    }

}
