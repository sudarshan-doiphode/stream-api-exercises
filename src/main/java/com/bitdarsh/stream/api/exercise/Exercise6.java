package com.bitdarsh.stream.api.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise6 {

    //    Sort a list of strings in alphabetical order, ascending and descending using streams.
    public static void main(String[] args) {
        var names = Arrays.asList("Sachin", "Aman", "Bunti", "Bob", "Zack", "Joy");
        final Stream<String> sortedNamesAscending = names.stream().sorted();
        sortedNamesAscending.forEach(System.out::println);
        System.out.println("--------------");
        final Stream<String> sortedNamesDescending = names.stream().sorted(Comparator.reverseOrder());
        sortedNamesDescending.forEach(System.out::println);

    }
}
