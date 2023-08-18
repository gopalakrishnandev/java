package com.example.OOP;

class MultilevelInheritance extends Animal {
    // multilevel inheritance
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends MultilevelInheritance {
    void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.setName("Gayle");
    }
}
