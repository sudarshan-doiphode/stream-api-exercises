package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise8 {
    //Find the second smallest and largest elements in a list of integers using streams.
    public static void main(String[] args) {
        var numbers = Arrays.asList(12, 34, 2, 45, 2, 1, 665, 122, 117, 999);
        final int secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Smallest Value is : "+ secondSmallest);

        final Integer secondLargest = numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Largest Value is : "+ secondLargest);
    }
}
