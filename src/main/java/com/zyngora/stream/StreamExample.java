package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> filerGrade = (s) -> s.getGrade() >= 3;
        Predicate<Student> filerGpa = (s) -> s.getGpa() >= 3.8;

        Map<String, List<String>> listMap =
                StudentDatabase.getAllStudents().stream()
                        .peek((student) -> System.out.println(student.getName())) // use this for debugging
                        .filter(filerGrade) // Stream<Students>
                        .peek((student) -> System.out.println("Student after filter 1: " + student.getName()))
                        .filter(filerGpa) // Stream<Students>
                        .peek((student) -> System.out.println("Student after filter 2: " + student.getName()))
                        .collect(Collectors.toMap(Student::getName, Student::getActivities)); // Map<String, List<String>>

        System.out.println(listMap);
    }
}
