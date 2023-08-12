package com.example.Objects;

public class PersonalData {

    public static void main(String[] args) {
        // creating new object with Index class
        Index firstObj = new Index();
        Index y = firstObj;
        // updating property value in object --1
        y.name = "kumar";
        // property value
        System.out.println(y.name);
        // class property value
        System.out.println(firstObj.name);
        // updating propery value -- 2
        firstObj.name = "sample";
        firstObj.age = 23;

        System.out.println(firstObj.name);
        System.out.println(firstObj.age);

    }

}
