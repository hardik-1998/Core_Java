package com.hardik.java8;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Belly");
        Cat mycat = optionalCat.orElse(new Cat("UNKNOWN",0));
        System.out.println("using map: " + optionalCat.map(Cat::getAge)
                        .orElse(0));
        System.out.println(mycat.getAge());
    }
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
