package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;

public class Exercise3 {

    // Calculate the sum of all even, odd numbers in a list using streams.
    public static void main(String[] args) {
        var nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        final int evenSum = nums.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 == 0)
                .sum();

        final int oddSum = nums.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 != 0)
                .sum();

        System.out.println("Sum of Even Number is : " + evenSum);
        System.out.println("Sum of Odd Number is : " + oddSum);

    }
}
