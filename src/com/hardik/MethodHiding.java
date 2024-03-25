package com.hardik;

public class MethodHiding {
    public static void m1(){
        System.out.println("m1 in MethodHiding class");
    }
    public void m2(){
        System.out.println("m2 is instance method of MethodHiding class");
    }


    public static void main(String[] args) {
        MethodHiding methodHiding1 = new MethodHiding();
        MethodHiding methodHiding = new B();
        methodHiding1.m1();
        methodHiding.m1();
        methodHiding.m2();
        B b = new B();
        b.m1();
        b.m2();
    }
}

class B extends MethodHiding {
    public static void m1(){
        System.out.println("m1 in B class");
    }

    public void m2(){
        System.out.println("m2 is instance method of B class");
    }
}
