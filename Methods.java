package com.example;

public class Methods {

    // method doesn't return anything
    public void printCopy() {
        System.out.println("Copy previous message");
        newCopy(3);
    }

    // method return something
    public int newCopy(int x) {
        return (x);
    }

}
