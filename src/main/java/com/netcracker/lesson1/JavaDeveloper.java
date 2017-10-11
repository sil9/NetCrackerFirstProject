package com.netcracker.lesson1;


public class JavaDeveloper extends Employee implements Developer {

    public JavaDeveloper() {
    }

    public JavaDeveloper(String name, long salary) {
        super(name, salary);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I like Java.");
    }

    public void writeCode() {
        System.out.println("Developer writes a Java code...");
    }
}
