package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    //  Convert a list of strings to uppercase or lowercase using streams
    public static void main(String[] args) {
        var names = Arrays.asList("Sachin", "manisH", "Suresh");
        final List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        final List<String> lowercaseNames = names.stream()
                .map(String::toLowerCase)
                .toList();

        uppercaseNames.forEach(System.out::println);
        System.out.println("------------");
        lowercaseNames.forEach(System.out::println);
    }
}
