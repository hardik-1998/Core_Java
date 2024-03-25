package com.hardik.callbyvalcallbyref;

public class CallByValueExample {
        int x = 20;
        void modify ( int x)
        {
            x = x + 200;
            System.out.println("Value of x after modification: " + x);
        }
        public static void main (String[]args)
        {
            CallByValueExample t = new CallByValueExample();
            t.modify(t.x);
            System.out.println("Original value of x: " + t.x);
            changeObjectRef(t);
            System.out.println("value of x:" + t.x); //changed bcz we passed reference of an object
        }

        public static void changeObjectRef(CallByValueExample callByValueExampleCopy) {
            callByValueExampleCopy.x = 280;
        }
    }
