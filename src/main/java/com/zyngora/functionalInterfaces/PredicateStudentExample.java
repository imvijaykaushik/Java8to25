package com.zyngora.functionalInterfaces;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGrade() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.8;

    static void filterStudentByGrade() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.test(student)) //s.getGrade() >= 3
                System.out.println(student);
        });
    }

    static void filterStudentByGPA() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p2.test(student)) //s.getGpa() >= 3.8
                System.out.println(student);
        });
    }

    static void filterStudent() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.or(p2).negate().test(student)) // predicate chaining
                System.out.println(student);
        });
    }

    public static void main(String[] args) {
        filterStudentByGrade();
        System.out.println("----------");
        filterStudentByGPA();
        System.out.println("----------");
        filterStudent();
    }
}
