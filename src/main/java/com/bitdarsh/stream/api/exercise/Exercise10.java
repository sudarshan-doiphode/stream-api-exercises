package com.bitdarsh.stream.api.exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {
//        Given a list of strings,
//        count the number of strings that have a length greater than 5.

        List<String> list = new ArrayList<>(List.of("he", "hello", "kiamotors", "helloworld", "hd"));
        long count = list.stream().filter(e -> e.length() > 5).count();
        System.out.println(count);
    }
}
