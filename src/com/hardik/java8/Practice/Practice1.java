package com.hardik.java8.Practice;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hardik");
        list.add("Pravin");
        list.add("Variya");
        list.add("Hiren");
        System.out.println(list);
        String[] array = list.toArray(new String[0]);
        for (String s :
                array) {
            System.out.println(s);
        }
        String[] strings = new String[10];
        strings[0] = "abc";
        strings[1] = "abc";
        strings[2] = "abc";
        strings[3] = "abc";
        strings[04] = "abc";
        for (String s :
                strings) {
            System.out.println(s);
        }
        System.out.println(strings[9]);

    }
}
