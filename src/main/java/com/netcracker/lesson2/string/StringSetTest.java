package com.netcracker.lesson2.string;

import com.netcracker.lesson2.Testable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class StringSetTest implements Testable {

    private String[] array = {"Opel", "VM", "Ferrari", "Tesla", "Toyota", "Ferrari"};

    private Set<String> set = new HashSet();

    @Override
    public void test() {
        addValuesToSet(array);
        printSetEntries(set);
    }

    private void printSetEntries(Set<String> set) {
        for (String entry : set) {
            System.out.println("Entry: " + entry);
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + set.size());
    }

    private void addValuesToSet(String[] array) {
        set.addAll(Arrays.asList(array));
    }
}
