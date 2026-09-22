package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> getStudentActivities() {

        return StudentDatabase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // unique
                .sorted() // sort in natural order
                .collect(toList());
    }

    public static long getStudentActivitiesCount() {
        return StudentDatabase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
    }

    public static void main(String[] args) {

        System.out.println(getStudentActivities());

        System.out.println(getStudentActivitiesCount());
    }
}
