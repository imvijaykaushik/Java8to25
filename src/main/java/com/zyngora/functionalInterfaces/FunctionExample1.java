package com.zyngora.functionalInterfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {
        return FunctionExample.addTwoString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println(result);
    }
}
