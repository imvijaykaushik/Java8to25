package com.zyngora.stream;

import com.zyngora.data.Student;
import com.zyngora.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> numberList) {
        return numberList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numberList) {
        return numberList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
//        return StudentDatabase.getAllStudents().stream()
//                .reduce((s1, s2) -> {
//                    if (s1.getGpa() > s2.getGpa()) {
//                        return s1;
//                    } else {
//                        return s2;
//                    }
//                });

        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(StreamsReduceExample.performMultiplication(numbers));

        Optional<Integer> result = StreamsReduceExample.performMultiplicationWithoutIdentity(numbers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        System.out.println(getHighestGpaStudent());
    }
}
