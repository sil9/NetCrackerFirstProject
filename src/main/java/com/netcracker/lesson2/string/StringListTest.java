package com.netcracker.lesson2.string;


import com.netcracker.lesson2.Testable;

import java.util.LinkedList;
import java.util.List;

public class StringListTest implements Testable {

    private String[] array = {"Opel", "VM", "Ferrari", "Tesla", "Toyota", "Ferrari"};

    private List list = new LinkedList();

    @Override
    public void test() {
        addValuesToList(array);
        printListEntries(list);
    }

    private void printListEntries(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Entry #" + i + ": " + list.get(i));
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + list.size());
    }

    private void addValuesToList(String[] array) {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }
}
