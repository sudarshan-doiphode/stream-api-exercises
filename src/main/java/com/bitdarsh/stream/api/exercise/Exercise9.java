package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;

public class Exercise9 {

    //    Find the first element of a Stream in Java
    public static void main(String[] args) {
        var names = Arrays.asList("Sachin", "Manish", "Neha");
        final String firstName = names.stream()
                .findFirst()
                .orElse("No name");

        System.out.println(firstName);
    }
}
