package com.bitdarsh.stream.api.exercise;

import com.bitdarsh.model.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise13 {
    public static void main(String[] args) {

        // Creating a list of given students
        List<Student> students = List.of(
                new Student("Panku", "Yadav", 21, "male", "Accounts", 2021, "Delhi", 4),
                new Student("Ankit", "Kashyap", 22, "male", "IT", 2021, "Ranchi", 4),
                new Student("Deepu", "Mehra", 23, "male", "DM", 2021, "Bangalore", 8),
                new Student("Aakash", "Singh", 23, "male", "Owner", 2021, "Nasik", 4),
                new Student("Ankush", "Sharma", 27, "male", "Accounts", 2021, "Ratnagiri", 1)
        );

        //Find number of students for each department.
        Map<String, Long> studentsForEachDept = students.stream()
                .map(Student::getDepartmentName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        studentsForEachDept.forEach((department, count) ->
                System.out.println("Department: " + department + ", Count: " + count)
        );
    }
}
