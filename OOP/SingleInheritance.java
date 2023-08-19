package com.example.OOP;

class SingleInheritance extends Animal {
    // single inheritance
    void bark() {
        System.out.println("barking...");
    }

}

class TestInheritance {
    public static void main(String args[]) {
        SingleInheritance d = new SingleInheritance();
        d.bark();
        d.setAge(3);

    }
}