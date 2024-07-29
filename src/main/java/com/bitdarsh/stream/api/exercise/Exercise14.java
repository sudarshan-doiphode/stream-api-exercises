package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.Comparator;
import java.util.List;

public class Exercise14 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 4),
                new Student("Anshu", "mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        //Find the student who is eldest.
        Student eldestStudent = students.stream()
                .max(Comparator.comparing(Student::getAge))
                .get();

        // find the student with the highest rank
        Student rankStudent = students.stream()
                .max(Comparator.comparing(Student::getRank))
                .get();

        System.out.println(eldestStudent);
        System.out.println(rankStudent);
    }
}
