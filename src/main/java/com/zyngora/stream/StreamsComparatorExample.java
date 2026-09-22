package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {


    public static List<Student> sortStudentByName() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    public static List<Student> sortStudentByGpa() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();
    }

    public static List<Student> filterStudents() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female")) // return only female student
                .filter(student -> student.getGpa()>3.8)
                .toList();
    }

    public static void main(String[] args) {

        System.out.println(sortStudentByName());
        System.out.println(sortStudentByGpa());
        System.out.println(filterStudents());
    }
}
