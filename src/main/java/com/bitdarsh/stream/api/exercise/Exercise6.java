package com.bitdarsh.stream.api.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        //Sort a list of strings in alphabetical order,
        // ascending and descending using streams.

        List<String> list = new ArrayList<>(List.of("Sachin","Amar","Aman","Vijay","Esha"));

        List<String> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descendingSorted = list.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("ASC Sorted List is : ");
        sorted.stream().forEach(e -> System.out.print(e +" "));
        System.out.println();
        System.out.println("DESC Sorted List is : ");
        descendingSorted.stream().forEach(e -> System.out.print(e +" "));

    }
}
