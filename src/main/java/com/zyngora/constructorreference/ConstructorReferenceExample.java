package com.zyngora.constructorreference;

import com.zyngora.data.Student;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    static BiFunction<String, Integer, Student> studentFunction1 = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get()); //Student{name='null', grade=0, gpa=0.0, gender='null', activities=[]}

        System.out.println(studentFunction.apply("abc")); //Student{name='abc', grade=0, gpa=0.0, gender='null', activities=[]}

        System.out.println(studentFunction1.apply("abc", 5)); //Student{name='abc', grade=5, gpa=0.0, gender='null', activities=[]}
    }
}
