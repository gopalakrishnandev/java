package com.example;

import com.example.Objects.Index;

public class PassByValue {

    //
    public static void main(String[] args) {
        String t = "dhoni";

        Index hello = new Index();
        hello.name = "sachin";

        System.out.println(t + "  " + hello.name + " " + "one");

        Changer(t, hello);
        System.out.println(t + "  " + hello.name + " " + "two");
    }

    public static void Changer(String t, Index hello) {
        t = "Kohli";
        hello.name = "sam";
        System.out.println(t + " " + hello.name + " " + "three");

    }
}
