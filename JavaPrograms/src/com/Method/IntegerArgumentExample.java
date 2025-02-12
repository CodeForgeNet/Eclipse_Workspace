package com.Method;

public class IntegerArgumentExample {

    // Method with an Integer argument
    public void display(Integer number) {
        System.out.println("The Integer value is: " + number);
    }

    // Overloaded method with a String argument
    public void display(String text) {
        System.out.println("The String value is: " + text);
    }

    public static void main(String[] args) {
        IntegerArgumentExample example = new IntegerArgumentExample();

        // Calling the method with an Integer object
//        Integer num = 123; // Autoboxing from int to Integer

        // Calling the overloaded method with a String
//        String str = "Hello, Roberto!";
//        example.display(str);
        
//        example.display(null); //compile time error , if we pass null value.
    }
}
