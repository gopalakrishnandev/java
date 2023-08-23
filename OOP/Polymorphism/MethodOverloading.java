package com.example.OOP.Polymorphism;

public class MethodOverloading {
    static String myCat(String name) {
        return name;
    }

    static int myCat(int age) {
        return age;
    }

    public static void main(String[] args) {
        String s = myCat("poppy");
        int n = myCat(23);
        System.out.println(s + " " + n);

    }
}
