package com.example.OOP;

class HierarchicalInheritance extends Animal {
    // Hierarchical Inheritance
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.setAge(3);
        // c.bark();// C.T.Error bark not available in Cat and Animal
    }
}