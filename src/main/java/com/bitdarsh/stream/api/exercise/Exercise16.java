package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise16 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 4),
                new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        // Find the department who is having maximum number of students
        Optional<Map.Entry<String, Long>> max = students.stream()
                .map(Student::getDepartmentName)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("Department: " + max.get().getKey() + ", count: " + max.get().getValue());
    }
}
