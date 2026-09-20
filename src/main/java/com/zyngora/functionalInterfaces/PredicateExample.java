package com.zyngora.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (x) -> {
        return x % 2 == 0;
    };
    static Predicate<Integer> p1 = (x) -> x % 2 == 0;
    static Predicate<Integer> p2 = (x) -> x % 5 == 0;

    static void predicateAnd() {
        System.out.println("Predicate And result: " + p1.and(p2).test(10)); //predicate chaining
        System.out.println("Predicate And result: " + p1.and(p2).test(9)); //predicate chaining
    }

    static void predicateOr() {
        System.out.println("Predicate Or result: " + p1.or(p2).test(10)); //predicate chaining
        System.out.println("Predicate Or result: " + p1.or(p2).test(8)); //predicate chaining
    }

    static void predicateNegate() {
        System.out.println("Predicate Negate result: " + p1.or(p2).negate().test(8)); //predicate chaining
    }

    public static void main(String[] args) {
        System.out.println("Predicate: " + p.test(10));
        System.out.println("Predicate: " + p.test(9));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
