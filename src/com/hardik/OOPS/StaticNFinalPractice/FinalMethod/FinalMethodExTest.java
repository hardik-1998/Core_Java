package com.hardik.OOPS.StaticNFinalPractice.FinalMethod;

class FinalMethodEx
{
    FinalMethodEx()
    {
        System.out.println("This is a default constructor");
    }
    final int a = 500;
    final void show()
    {
        System.out.println("Value of a: " +a);
    }
}
public class FinalMethodExTest extends FinalMethodEx
{
//    void show()
//    {
//        // Compile time error because we cannot override the final method from FinalMethodEx.
//        System.out.println("This is the final method of FinalMethodEx class");
//    }

    public static void main(String[] args)
    {
        String s = "Hardik";
        // Create an object of FinalMethodEx class.
        FinalMethodEx fm = new FinalMethodEx();

        // Call final method using reference variable fm.
        fm.show();
    }
}