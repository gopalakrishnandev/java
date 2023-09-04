package com.example.Interface;

public interface Dog {
    void CatchAndEat();

    default void preyMethod() {
        System.out.println("Dog running...");
    }
}
