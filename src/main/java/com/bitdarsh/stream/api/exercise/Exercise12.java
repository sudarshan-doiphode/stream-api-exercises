package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 4),
                new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        // Find list of student's first name whose first name ends with alphabet u
        List<String> nameWithU = students.stream()
                .map(Student::getFirstName)
                .filter(firstName -> firstName.endsWith("u")).toList();

        nameWithU.forEach(System.out::println);
    }
}
