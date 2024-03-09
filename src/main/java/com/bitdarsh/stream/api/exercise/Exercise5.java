package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;

public class Exercise5 {

    // Count the number of strings in a list that start with a specific letter using streams.
    public static void main(String[] args) {
        var names = Arrays.asList("Sachin", "Krutika", "Josh", "Mrunal", "Van", "Josh", "Jason");

        Long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println("Count of Names starts with J : " + count);
    }
}
