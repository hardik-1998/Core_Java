package com.hardik.java8.Stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {
        Book ramayan = new Book("Ramayana", "Valmiki", 100.0);
        Book mahabharat = new Book("Mahabharata", "Veda Vyasa", 200.0);
        Book bhagvadGita = new Book("The Bhagavad Gita", "Krishna-Dwaipayana Vyasa", 150.0);
        Book shivaBook = new Book("7 Secrets Of Shiva", "Devdutt Pattanaik", 300.0);

        Book[] books = {ramayan, mahabharat, bhagvadGita, shivaBook};
        Stream<Book> stream = Arrays.stream(books);
        String geekific = Optional.of("Geekific").orElse(print());
        System.out.println("geekific: " + geekific);
        String geekific1 = Optional.of("Geekific").orElseGet(() -> print());
        System.out.println("geekific1: " + geekific1);
        Object geekific3 = Optional.empty().orElseGet(() -> print());
        System.out.println("geekific3: " + geekific3);
        //terminal operation methods
        //forEach,findFirst,findAny,
        // anyMatch/allMatch/noneMatch
        System.out.println("anyMatch:" + IntStream.of(25,15,75,45,65,5,40).anyMatch(i->i%2==0));
        System.out.println("allMatch:" + IntStream.of(25,15,75,45,65,5,40).allMatch(i->i%2==0));
        System.out.println("noneMatch:" + IntStream.of(25,15,75,45,65,5,40).noneMatch(i-> i > 80));
        OptionalDouble average = Arrays.stream(new int[]{10, 20, 30}).average();
        System.out.println("Avg of numbers:" + average.getAsDouble());
        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println("even = " + even);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer integer = list.stream().reduce(Integer::sum).get();
        System.out.println(integer.intValue());
        Integer integer1 = Stream.of(1, 2, 3, 4, 5,-6).reduce(0,Integer::sum);
        System.out.println("integer1: " + integer1);

        stream.min(Comparator.comparing(Book::getAuthor)).ifPresent(System.out::println);
        Optional<Book> alphabeticallyFirstAuthor = stream.min(Comparator.comparing(Book::getAuthor));
        System.out.println("alphabeticallyFirstAuthor: " + alphabeticallyFirstAuthor.get());

        Stream<Book> indianMythologyBooks = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook);

        //terminal operation methods
        Object[] array = indianMythologyBooks.toArray();
        Book[] array1 = indianMythologyBooks.toArray(Book[]::new);
        long count = indianMythologyBooks.count();

        Optional<Book> mostExpensiveBook = indianMythologyBooks.max(Comparator.comparing(Book::getPrice));// shivaBook
        Optional<Book> alphabeticallyFirstBookTitle = indianMythologyBooks.min(Comparator.comparing(Book::getTitle));

        Book book = alphabeticallyFirstBookTitle.get();
        System.out.println(book);

    }

    private static String print() {
        System.out.println("Like");
        return "Subscribe";
    }
}
