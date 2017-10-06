package com.netcracker;

import com.netcracker.lesson1.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(new Customer("Jacky", 300),
                new JavaDeveloper("Dmitry", 10), new KotlinDeveloper("Katy", 30)));
        persons.forEach(Person::speak);
        List<Developer> developers = new ArrayList<>(Arrays.asList(new JavaDeveloper(), new KotlinDeveloper()));
        developers.forEach(Developer::writeCode);
    }
}
