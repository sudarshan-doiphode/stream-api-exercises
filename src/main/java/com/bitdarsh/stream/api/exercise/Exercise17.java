package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.Comparator;
import java.util.List;

public class Exercise17 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "fbd", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "fbd", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "fbd", 4),
                new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "fbd", 1)
        );


        // Find the Students who stays in fbd and sort them by their names
        List<Student> citySt = students.stream()
                .filter(s -> s.getCity().equalsIgnoreCase("fbd"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .toList();

        citySt.forEach(System.out::println);
    }
}
