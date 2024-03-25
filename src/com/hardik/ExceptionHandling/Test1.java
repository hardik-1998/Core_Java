package com.hardik.ExceptionHandling;

public class Test1 {
    public static void main(String[] args)
    {
        try {
            System.out.println("ABC");
            int a  = 5, b = 10, c = 5;
            a += 5; // a = a + 5 = 5 + 5 = 10
            b -= a + c;// b = b - (a + c) = 10 - (10 + 5) = -5
            int x = (a + b)/(b + c);
            System.out.println(x);
            System.exit(0);
        }
        catch(ArithmeticException ae) {
            System.out.println("PQR");
        }
        finally {
            System.out.println("XYZ");
        }

        try {
            method();
            System.out.println("I am in try block");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    static void method() throws Exception {
        try {
            int a[] = {10, 20, 30, 40};
            a[10] = 5;
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("ArrayIndexOutOfBoundsException in method()");
        }
        catch (RuntimeException re) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception e) {
            System.out.println("Exception in method()");
        }
    }

}
