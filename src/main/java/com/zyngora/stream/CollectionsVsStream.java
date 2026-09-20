package com.zyngora.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    /**
     * 1- In collection we can add, remove and modify in the collections
     * but, it is not the case for streams, we can not update the streams value
     * <p>
     * 2- Elements in the collections can be accesses in any order. Use appropriate method base on the
     * collection e.g. list.get(2)
     * but elements in the Stream can be accessed in sequence
     * <p>
     * 3- Collection is eagerly constructed but Streams are lazily constructed
     * <p>
     * 4- Collection can traverse as many times as we want , but in stream we can traverse only once
     * <p>
     * 5- Collection perform External iteration but Stream perform Internal iteration
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vijay");
        names.add("Lado");
        names.add("Bitto");

        System.out.println(names);

        names.remove(0);
        names.add("New");

        System.out.println(names);

        // names.stream().add() Stream does not have something similar.

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println); // work correct
        // runtime exception IllegalStateException:stream has already been operated upon or closed
//        stream.forEach(System.out::println);
    }
}
