package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise8 {
    public static void main(String[] args) {

//      Find the second smallest and largest elements in a list of integers using streams.

        List<Integer> numbers = Arrays.asList(7, 2, 5, 3, 9, 1, 4, 8, 6);

        Optional<Integer> secondSmallest = numbers.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst();

        Optional<Integer> secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct().
                skip(1)
                .findFirst();

        secondSmallest.ifPresent(s -> System.out.println("Second Smallest: " + s));
        secondLargest.ifPresent(s -> System.out.println("Second Largest: " + s));
    }
}
