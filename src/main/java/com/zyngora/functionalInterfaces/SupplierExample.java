package com.zyngora.functionalInterfaces;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    // does not accept any input value, it  returns output result
    // it seems like opposite of Consumer

    static Supplier<Student> studentSupplier = () -> {
        return new Student("Ajay", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
    };

    static Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Students are : " + listSupplier.get());

    }
}
