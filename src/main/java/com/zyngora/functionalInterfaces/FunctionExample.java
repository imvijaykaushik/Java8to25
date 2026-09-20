package com.zyngora.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addTwoString = (name) -> name.toUpperCase() + "default";

    public static void main(String[] args) {
        System.out.println(function.apply("java8"));
        System.out.println(function.andThen(addTwoString).apply("java8")); //JAVA8default
        System.out.println(function.compose(addTwoString).apply("java8")); //JAVA8DEFAULT
    }
}
