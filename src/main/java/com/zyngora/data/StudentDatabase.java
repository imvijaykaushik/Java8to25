package com.zyngora.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Ajay", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
    };

    public static List<Student> getAllStudents() {
        Student student1 = new Student("Ajay", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("Anil", 2, 3.8, "male", Arrays.asList("swimming", "basketball", "soccer"));

        Student student3 = new Student("Rahul", 3, 3.7, "male", Arrays.asList("cricket", "swimming", "drawing"));
        Student student4 = new Student("Priya", 3, 3.9, "female", Arrays.asList("dancing", "basketball", "reading"));

        Student student5 = new Student("Rohan", 4, 3.5, "male", Arrays.asList("soccer", "cycling", "chess"));
        Student student6 = new Student("Ananya", 4, 3.8, "female", Arrays.asList("singing", "drawing", "volleyball"));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
