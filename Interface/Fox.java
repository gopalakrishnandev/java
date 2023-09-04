package com.example.Interface;

public class Fox extends Mammal implements Dog, Cat {
    @Override
    public void CatchAndEat() {
        System.out.println("Dog is running inside Fox ");
    }

    @Override
    public void ball() {
        // TODO Auto-generated method stub
        System.out.println("Cat is running inside Fox ");
    }

    @Override
    public void preyMethod() {
        System.out.println("Dog running...");
    }

}
