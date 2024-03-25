package com.hardik.OOPS.StaticNFinalPractice;

public class Animal {
    static int legs;
    String color;
    static class Properties {
        public void legsProp(){
            legs = 4;
//            color = "Brown"; instance variable
            display();
        }
        public void display() {
            System.out.println(legs);
        }
    }

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.legsProp();
    }
}
