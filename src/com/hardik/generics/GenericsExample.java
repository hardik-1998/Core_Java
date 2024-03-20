package com.hardik.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Print<Integer> integerPrint = new Print<Integer>(100);
        integerPrint.print();

        Print<String> stringPrint = new Print<String>("Hardik");
        stringPrint.print();

        Print<Double> doublePrint = new Print<Double>(123.2);
        doublePrint.print();

        shout("Hardik");
        shout(999);
        shout(9.99);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        printList(integerList);

        ArrayList arrayList = new ArrayList();
        arrayList.add("String");
        Object o = arrayList.get(0);
        System.out.println((String) o);

        List list = new ArrayList<>();
        list.add("String");
        System.out.println(list);
    }
    private static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!!!!!!!");
    }

    private static void printList(List<?> myList) {
        System.out.println("inside printList" + myList);
    }
}
