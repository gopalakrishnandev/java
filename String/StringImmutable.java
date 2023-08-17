package com.example.String;

public class StringImmutable {
    public static void main(String[] args) {
        // immutable String
        Text k = new Text();
        k.age = 3;
        int y = k.age;
        System.out.println(k.age);
        System.out.println(y);

        y = 55;
        System.out.println(y);
        System.out.println(k.age);

        // mutable String
        Text t = new Text();
        t.setAge(34);
        Text t3 = t;
        System.out.println(t.getAge());
        System.out.println(t3.getAge());

        // string comparison

        String a = "hi";
        String b = new String("hi");

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
