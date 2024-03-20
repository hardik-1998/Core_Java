package com.hardik.java8.Stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonTerminalOperation {
    public static void main(String[] args) {
        Book ramayan = new Book("Ramayana", "Valmiki", 100.0);
        Book mahabharat = new Book("Mahabharata", "Veda Vyasa", 200.0);
        Book bhagvadGita = new Book("The Bhagavad Gita", "Krishna-Dwaipayana Vyasa", 150.0);
        Book shivaBook = new Book("7 Secrets Of Shiva", "Devdutt Pattanaik", 300.0);

        Stream<Book> bookStream = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook);
        // Collect
        List<Book> bookList = bookStream.collect(Collectors.toList());
        for (Book b : bookList){
            System.out.println("List:" + b);
        }
        Set<Book> bookSet = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).collect(Collectors.toSet());
        bookSet.forEach(System.out::println);

        LinkedList<Book> bookLinkedList = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).collect(Collectors.toCollection(LinkedList::new));
        bookLinkedList.forEach(System.out::print);

        // non terminal operation
        //skip,limit
        System.out.println();
        long countAfterSkip = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).skip(2).count();
        System.out.println("countAfterSkip:" + countAfterSkip);

        long countAfterLimit = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).limit(3).count();
        System.out.println("countAfterLimit:" + countAfterLimit);
        Random random = new Random();
        Stream.generate(()-> random.nextInt(Integer.MAX_VALUE - 1) + 2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        System.out.println("iterate for first 10 numbers");
        Stream.iterate(1, n-> n+1).limit(10).forEach(System.out::println);
        System.out.println("iterate for first 10 odd numbers");
        Stream.iterate(1, n-> n+2).limit(10).forEach(System.out::println);


    }
}
