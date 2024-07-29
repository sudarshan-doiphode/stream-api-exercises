package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise18 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 2),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 3),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 5),
                new Student("Anshu", "Mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        // Find the highest rank in each department
        Map<String, Optional<Student>> highestRank = students.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getDepartmentName,
                                Collectors.maxBy(Comparator.comparing(Student::getRank))
                        )
                );
    }
}
