package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise9 {
    public static void main(String[] args) {
//      Find the first element of a Stream in Java (Geeks for Geeks)
        List<String> strings = Arrays.asList("Geeks", "for", "Geeks", "is", "a", "DSA", "portal");

        Optional<String> firstElement = strings.stream().findFirst();

        // Check if the first element is present and print it
        firstElement.ifPresent(System.out::println);
    }
}
