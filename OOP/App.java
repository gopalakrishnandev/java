package com.example.OOP;

public class App {
    public static void main(String[] args) {
        SingleInheritance cat = new SingleInheritance();
        MultilevelInheritance cow = new MultilevelInheritance();

        cow.setAge(34);
        cat.setAge(43);

        cat.setName("Bob");
        cow.setName("Robert");
    }
}
