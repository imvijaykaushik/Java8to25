package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static List<String> namesList() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Set<String> namesSet() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
