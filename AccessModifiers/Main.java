package com.example.AccessModifiers;

public class Main {
    public static void main(String[] args) {

        PublicAccess name = new PublicAccess();
        // name.p = "sam cs";
        name.newMeth();

        // PrivateAccess details = new PrivateAccess();
        // details.age = 45;
        // details.getAge();

        DefaultAccess dAccess = new DefaultAccess();

        // dAccess.x = 8;
        // dAccess.hey();
        // public access from Public Access object
        name.newMeth();

        ProtectedAccess objAccess = new ProtectedAccess();
        objAccess.pAccess("dd");
        // default access from Default Access object
        dAccess.hey();
        // public access from Public Access object
        name.newMeth();

    }

}
