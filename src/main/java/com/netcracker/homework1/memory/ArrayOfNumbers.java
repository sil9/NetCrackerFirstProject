package com.netcracker.homework1.memory;


public class ArrayOfNumbers {
    private static int[] array;

    public static void init(int size) {
        array = new int[size];
    }

    public static int[] getArray() {
        return array;
    }
}
