package com.zyngora.functionalInterfaces;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGrade() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.8;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.8;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> c1 = (student -> {
        if (p1.and(p2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    Consumer<Student> c2 = (student -> {
        if (biPredicate.test(student.getGrade(), student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList ) {
        studentList.forEach(c1);
        System.out.println("-------------");
        studentList.forEach(c2);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
