package com.zyngora.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    // use UnaryOperator if input param and return type is same type
    static UnaryOperator<String> concatString = (s) -> s.concat("default");

    public static void main(String[] args) {
        System.out.println(concatString.apply("java8"));
    }
}
