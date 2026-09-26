package com.zyngora.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Vijay", "Ajay", "Arun");
        nameStream.forEach(System.out::println);

        Stream<Integer> intStream = Stream.iterate(1, i -> i * 2);
        intStream
                .limit(15)
                .forEach(System.out::println);

        Stream<Integer> intStream1 = Stream.generate(new Random()::nextInt);
        intStream1
                .limit(15)
                .forEach(System.out::println);
    }
}
