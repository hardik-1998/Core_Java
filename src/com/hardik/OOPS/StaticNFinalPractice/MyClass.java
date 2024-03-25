package com.hardik.OOPS.StaticNFinalPractice;

public class MyClass {
    static int a = 20;

    static {
        a++;
    }
    static {
        ++a;
    }
    {
        a--;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        MyClass obj = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
    }
}
