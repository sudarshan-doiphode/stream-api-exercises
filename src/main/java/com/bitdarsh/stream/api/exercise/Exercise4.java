package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise4 {

    // Remove all duplicate elements from a list using streams.
    public static void main(String[] args) {
        var numbers = Arrays.asList(1, 1, 3, 2, 5, 7, 7, 37, 8, 3654, 3, 2, 1);
        Stream<Integer> distinctNumbers = numbers.stream().distinct();

        distinctNumbers.forEach(System.out::println);
    }
}
