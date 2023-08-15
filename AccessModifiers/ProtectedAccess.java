package com.example.AccessModifiers;

public class ProtectedAccess {
    protected String name;

    // public static void main(String[] args) {
    // ProtectedAccess obj = new ProtectedAccess();
    // System.out.println(obj.name);
    // }

    protected void pAccess(String name) {
        System.out.println(name);
    }
}
