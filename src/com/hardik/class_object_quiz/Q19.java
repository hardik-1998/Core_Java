package com.hardik.class_object_quiz;

public class Q19 {
    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }

    public Q19()
    {
        System.out.println(3);
    }

    public static void main(String[] args)
    {
        System.out.println(4);

        Q19 a = new Q19();
    }
}
