package com.hardik.java8.Stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOperation {

    public static void main(String[] args) {
        Book ramayan = new Book("Ramayana", "Valmiki", 100.0);
        Book mahabharat = new Book("Mahabharata", "Valmiki", 200.0);
        Book bhagvadGita = new Book("The Bhagavad Gita", "Krishna-Dwaipayana Vyasa", 150.0);
        Book shivaBook = new Book("7 Secrets Of Shiva", "Devdutt Pattanaik", 300.0);

        Stream<Book> bookStream = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook);
        DoubleSummaryStatistics collect = bookStream.collect(Collectors.summarizingDouble(Book::getPrice));
        System.out.println(collect.getMax());

        double doubleSummaryStatistics = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook).mapToDouble(Book::getPrice).summaryStatistics().getMin();
        System.out.println(doubleSummaryStatistics);


        //partitioningBy
        Map<Boolean, List<Integer>> collect1 = Stream.of(10, 15, 20, 25, 30, 35)
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        collect1.forEach((key, valueList)->{
            System.out.println("Key: " + key);
            System.out.println("Values: " + valueList);
        });
        //groupingBy
        Map<String, List<Book>> collect2 = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook)
                .collect(Collectors.groupingBy(Book::getAuthor));

        collect2.forEach((key, valueList)->{
            System.out.println("Key: " + key);
            System.out.println("Values: " + valueList);
        });

        //groupingBy with mapping
        Map<String, List<String>> collect3 = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook)
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));
        collect3.forEach((key, valueList)->{
            System.out.println("Key: " + key);
            System.out.println("Values: " + valueList);
        });

        //groupingBy with reducing
        System.out.println("groupingBy with reducing");
        Map<String, Optional<Book>> collect4 = Stream.of(ramayan, mahabharat, bhagvadGita, shivaBook)
                .collect(
                        Collectors.groupingBy(
                                Book::getAuthor,
                                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Book::getPrice)))
                        )
                );
        collect4.forEach((key, valueList)->{
            System.out.println("Key: " + key);
            System.out.println("Values: " + valueList);
        });
    }
}
