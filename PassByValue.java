package com.example;

import com.example.Objects.Index;

public class PassByValue {

    //
    public static void main(String[] args) {
        String t = "dhoni";

        Index hello = new Index();
        hello.name = "sachin";

        SecondClass k = new SecondClass();
        k.lName = "charles";
        System.out.println(t + "  " + hello.name + " " + k.lName + " " + "one");

        Changer(t, hello, k);  
        System.out.println(t + "  " + hello.name + " " + k.lName+ " " +"two");
    }

    public static void Changer(String t, Index hello, SecondClass k) {
        t = "Kohli";
        hello.name = "sam";
        k.lName = "russell";  
        System.out.println(t + " " + hello.name + " " + k.lName+ " " + "three");

    }
}
