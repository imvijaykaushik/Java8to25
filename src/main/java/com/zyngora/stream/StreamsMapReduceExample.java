package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

public class StreamsMapReduceExample {

    public static int noOfNotebooks() {
//        return StudentDatabase.getAllStudents().stream()
//                .map(Student::getNotebooks) //Stream<Integer>
//                .reduce(0, (x, y) -> x + y);

        return StudentDatabase.getAllStudents().stream()
                .filter(s -> s.getGrade() >= 3.5)
                .filter(s -> s.getGender().equals("male"))
                .map(Student::getNotebooks) //Stream<Integer>
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("No of notebooks: " + noOfNotebooks());
    }
}
