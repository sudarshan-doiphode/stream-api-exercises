package com.bitdarsh.stream.api.exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
//        Find the maximum and minimum values in a list of integers using streams.
        List<Integer> integers = new ArrayList<>(List.of(20, 11, 1, 122, -1, 0));
        Integer max = integers.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

        Integer min = integers.stream()
                .min((a, b) -> a.compareTo(b))
                .get();

        System.out.println("Maximum integer in a list : " + max);
        System.out.println("Minimum integer in a list : " + min);
    }
}
