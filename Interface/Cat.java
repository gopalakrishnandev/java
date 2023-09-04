package com.example.Interface;

public interface Cat {
    void ball();

    default void preyMethod() {
        System.out.println("Cat running...");
    }
}
