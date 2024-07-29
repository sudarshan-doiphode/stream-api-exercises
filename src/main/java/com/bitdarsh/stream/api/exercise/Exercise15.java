package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise15 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Punnu", "Yadav", 21, "female", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Gunnu", "Mehra", 23, "female", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "female", "Owner", 2021, "Nasik", 4),
                new Student("Micku", "mishra", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        Map<String, Double> avgAgeBasedOnGender = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getAge)
                ));

        avgAgeBasedOnGender.forEach((gender, averageAge) -> {
            System.out.println("Gender: " + gender + ", average age: " + averageAge);
        });
    }
}
