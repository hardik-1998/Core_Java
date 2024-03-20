package com.hardik.generics;

public class Print <T> {
    T thingToPrint;

    public Print(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
