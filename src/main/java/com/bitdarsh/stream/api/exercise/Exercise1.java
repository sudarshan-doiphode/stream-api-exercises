package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;

public class Exercise1 {

    //  Question: Calculate Average of Integers using Streams
    //  Remember to use double as avg is in double as well
    public static void main(String[] args) {
        var nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        final double averageValue = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average value is: " + averageValue);
    }
}
