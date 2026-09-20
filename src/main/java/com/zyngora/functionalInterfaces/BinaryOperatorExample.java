package com.zyngora.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    // operands and the result are all of the same type
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {

        System.out.println(binaryOperator.apply(1, 2));

        System.out.println("Result of MaxBy : " + maxBy.apply(4, 5));
        System.out.println("Result of MinBy : " + minBy.apply(4, 5));
    }
}
