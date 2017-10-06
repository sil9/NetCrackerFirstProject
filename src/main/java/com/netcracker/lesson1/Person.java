package com.netcracker.lesson1;

public abstract class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.print("My name is " + this.name + ". ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
