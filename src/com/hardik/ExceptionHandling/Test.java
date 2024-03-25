package com.hardik.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("111");
        try {
            System.out.println("222");
            double y = 1.0/0;
            if (y == Double.POSITIVE_INFINITY || y == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e)
        {
            try {
                System.out.println("Hello");
                int x = 20/0;
            }
            catch(NullPointerException np)
            {
                System.out.println("333");
            }
        }
        System.out.println("444");
        //Unchecked Exception -> inherit the RuntimeException
        double n[] = {3.2, 3, 4, 6};
        int a = 4;
        double x = n[0]/(a - n[2]);
        System.out.println(x);

        String str = "Java Programming";
//        int aa = Integer.parseInt(str); // this line will give runtime error which is NumberFormatException
//        System.out.println("Value of a: " +aa);

        /*Checked Exception -> The classes that directly inherit the Throwable class
         except RuntimeException and Error are known as checked exceptions.
         */
        File file = new File("not_existing_file.txt");
        //FileInputStream stream = new FileInputStream(file); //this line will give Compile Time error
        /*Checked Exception Ends*/

        try {
            int value = 5;
            if (value < 10)
                throw new RuntimeException("Value is less than 10");
        }
        catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
        System.out.println("Outside try-catch block");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                int i1 = 10;
                int b = 0;
                int c = i1/b;
                System.out.println(c);
            } catch (ArithmeticException ae) {

            }
        }
        System.out.println();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
                int i2 = 20;
                int b = 0;
                int c = i2/b;
                System.out.println(c);
            }
        } catch (ArithmeticException ae) {

        }
        System.out.println();
        double tab[] = {1.2, 3.4, 0.0, 5.6};
        try {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = 1.0 / tab[i];

                if (tab[i] == Double.POSITIVE_INFINITY ||
                        tab[i] == Double.NEGATIVE_INFINITY)
                    throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }

    }
}
