package com.hardik.OOPS.StaticNFinalPractice;

import java.util.ArrayList;
import java.util.List;

public class FinalVariableEx
{
    // Declare a final instance variable.
    final int a = 20;
    final int b; //Blank Final Variable and must be initialized in the constructor of the class

    final static int c; //Uninitialized Static Blank Final and only be initialized in the static block

    static {
        c = 40;
    }

    FinalVariableEx() {
        b = 30;
    }

    // Declare an instance method.
    void change()
    {
        // Change the value of the final instance variable.
//        a = 40; // compile time error. A final variable's value cannot be changed.
        System.out.println(a);

        // Declare a final local variable inside the method.
        final int i = 0;
//        for(i=0; i< 5; i++) // compile time error. as i is declared as final
//        {
//            System.out.println("Value of I: " +i);
//        }
    }
    public static void main(String[] args)
    {
        // Create an object of the class.
        FinalVariableEx fv = new FinalVariableEx();

        // Call change() method using reference variable fv.
        fv.change();

        final List<Integer> list = new ArrayList<>();

// Adding elements in the list.
        list.add(20);
        list.add(30);
        list.add(40);
//        list = new ArrayList<>(); Final local variable 'list' cannot refer to new

    }
}
