package com.zyngora.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> upperCaseLambda = (s) -> s.toUpperCase(); //lambda

    static Function<String,String> upperCaseLambda1 = String::toUpperCase; // method reference

    public static void main(String[] args) {

        System.out.println(upperCaseLambda.apply("vijay"));

        System.out.println(upperCaseLambda1.apply("kaushik"));
    }
}
