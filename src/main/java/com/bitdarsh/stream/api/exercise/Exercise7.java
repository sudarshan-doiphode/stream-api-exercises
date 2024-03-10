package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class Exercise7 {

    // Find the maximum and minimum values in a list of integers using streams.
    public static void main(String[] args) {
        var numbers = Arrays.asList(3, 4, 5, 68, 321, 0, 22, 55);
        final OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Maximum value from the list : " + max.getAsInt());

        final OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Minimum value from the list : " + min.getAsInt());

    }
}
