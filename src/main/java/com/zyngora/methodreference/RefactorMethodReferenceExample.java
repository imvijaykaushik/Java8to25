package com.zyngora.methodreference;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = (s) -> s.getGrade() >= 3;
    static Predicate<Student> p2 = RefactorMethodReferenceExample::graterThenGrade;

    static boolean graterThenGrade(Student s) {
        return s.getGrade() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
        System.out.println(p2.test(StudentDatabase.studentSupplier.get()));
    }
}
