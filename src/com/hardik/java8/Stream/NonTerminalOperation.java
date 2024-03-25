package com.hardik.java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        // non terminal operation or intermediate operation
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

        //distinct intermediate operation
        IntStream.of(10,10,20,30).distinct().forEach(System.out::println);

        //sorted intermediate operation
        System.out.println("sorted-----------------------");
        List<Integer> sortedIntegerList = Stream.of(25, 15, 10, 45, 50).sorted().collect(Collectors.toList());
        sortedIntegerList.stream().forEach(System.out::println);

        Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).sorted(Comparator.comparing(Book::getPrice)).forEach(System.out::println);
        Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).sorted(Comparator.comparing(Book::getPrice).thenComparing(Book::getAuthor)).forEach(System.out::println);

        //filter intermediate operation
        System.out.println("filter-----------------------");
        IntStream.of(10,20,40,30).filter(i -> i < 30).forEach(System.out::println);

        //map intermediate operation
        System.out.println("map-----------------------");
        Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).map(book -> book.getTitle()).forEach(System.out::println);

        //peek---it is basically foreach operation but instead of being terminal it is intermediate
        System.out.println("peek-----------------------");
        Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).
                filter(book -> book.getPrice() >= 200).
                peek(e-> System.out.println("Filtered value : " + e)).
                map(book -> book.getTitle().toUpperCase()).
                peek(e-> System.out.println("Mapped value : " + e)).collect(Collectors.toList());

        //flatMap it is an intermediate operation

        List<List<Integer>> list = Arrays.asList(Arrays.asList(10, 20, 30), Arrays.asList(40, 50, 60));
        List<Integer> integerList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        integerList.stream().forEach(System.out::println);
    }
}
