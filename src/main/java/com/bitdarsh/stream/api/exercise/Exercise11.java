package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.List;

public class Exercise11 {

    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "female", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "female", "Owner", 2021, "Nasik", 4),
                new Student("Ankush", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        // Find list of students whose first name starts with the letter 'A'
        List<Student> studentsWithA = students.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .toList();

        // Print the list of filtered students
        studentsWithA.forEach(System.out::println);
    }
}
