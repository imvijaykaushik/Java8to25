package com.zyngora.methodreference;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {


    static Consumer<Student> c1 = (student) -> System.out.println(student); // lambda
    /**
     * ClassName::methodName
     */
    static Consumer<Student> c2 = System.out::println; // method reference

    static Consumer<Student> c3 = (s) -> s.printActivities();
    /**
     * ClassName::instanceMethodName
     */
    static Consumer<Student> c4 = Student::printActivities;

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);
        System.out.println("-------------");
        StudentDatabase.getAllStudents().forEach(c2);
        System.out.println("-------------");
        StudentDatabase.getAllStudents().forEach(c3);
        System.out.println("-------------");
        StudentDatabase.getAllStudents().forEach(c4);
    }
}
