package com.hardik.java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Geekific {
    public static void main(String[] args) {
        //Creating Stream from scratch
        Stream<Integer> integerStream = Stream.of(10, 20, 40, -60, 5, 80);
        IntStream intStream = IntStream.of(10, 20, 40, -60, 5, 80);
        IntStream range = IntStream.range(1, 10); //1-9
        IntStream intStream1 = IntStream.rangeClosed(1, 10);//1-10
        Stream<String> build = Stream.<String>builder().add("Hardik").add("Hiren").add("Pravin").add("Sakar").add("Variya").build();

        //Creating Stream from ArrayList,LinkedList or a Java Array
        //Any class that implements Collection interface can be turned into Stream by calling stream() into it.


        //obtain Stream from an existing ARRAY
        Integer[] intArray = {10,20,40,80,-10,100};
        Stream<Integer> stream = Arrays.stream(intArray);

        //obtain Stream from an existing LIST
        List<Integer> list = Arrays.asList(intArray); // converting ARRAY of an Integer to LIST of an Integer
        Stream<Integer> streamFromList = list.stream();

    }
}
