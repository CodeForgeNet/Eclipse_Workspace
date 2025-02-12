package com.List;

import java.util.Comparator;
import java.util.TreeSet;

//Write a program to create a Set with a custom comparator in Java.

public class Main {
    public static void main(String[] args) {
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        TreeSet<String> set = new TreeSet<>(customComparator);
        set.add("Hello");
        set.add("World");
        set.add("Hi");

        for (String s : set) {
            System.out.println(s);
        }
    }
}