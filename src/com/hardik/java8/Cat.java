package com.hardik.java8;

public class Cat {
    int age;
    String catName;
    public Cat() {
    }

    public Cat(String catName, int age) {
        this.age = age;
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
