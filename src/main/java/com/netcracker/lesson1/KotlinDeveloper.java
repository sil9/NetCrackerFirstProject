package com.netcracker.lesson1;

public class KotlinDeveloper extends Employee implements Developer {

    public KotlinDeveloper() {
    }

    public KotlinDeveloper(String name, long salary) {
        super(name, salary);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I like Kotlin.");
    }

    public void writeCode() {
        System.out.println("Developer writes a Kotlin code...");
    }
}
