package com.zyngora.functionalInterfaces;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printNames() {
        List<Student> studentsList = StudentDatabase.getAllStudents();
        studentsList.forEach(c2);
    }

    public static void printNameAndActivity() {
        List<Student> studentsList = StudentDatabase.getAllStudents();
        studentsList.forEach(c3.andThen(c4)); // consumer chaining

    }

    public static void printNameAndActivityUsingCondition() {
        List<Student> studentsList = StudentDatabase.getAllStudents();
        studentsList.forEach(student -> {
            if (student.getGrade() >= 3 && student.getGpa() >= 3.9)
                c3.andThen(c4).accept(student);
        });
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        System.out.println("-----------");
        printNames();
        System.out.println("-----------");
        printNameAndActivity();
        System.out.println("-----------");
        printNameAndActivityUsingCondition();
    }
}
