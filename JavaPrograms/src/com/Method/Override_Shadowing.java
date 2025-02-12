package com.Method;

class Parenttt {
    void instanceMethod() {
        System.out.println("Parent's instance method");
    }
    static void staticMethod() {
        System.out.println("Parent's static method");
    }
}

class Childdd extends Parenttt {
    // method overriding
    void instanceMethod() {
        System.out.println("Child's instance method");
    }
    // method shadowing
    static void staticMethod() {
        System.out.println("Child's static method");
    }
}

public class Override_Shadowing {
    public static void main(String[] args) {
        Parenttt p = new Childdd();
        p.instanceMethod(); // Outputs "Child's instance method" - method overriding
        p.staticMethod(); // Outputs "Parent's static method" - method shadowing
    }
}
