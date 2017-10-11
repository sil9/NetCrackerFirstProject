package com.netcracker.homework1.memory;


import java.util.ArrayList;
import java.util.List;

public class InputValues {
    private static List<Integer> list = new ArrayList<>();

    public static void add(Integer integer){
        list.add(integer);
    }

    public static List<Integer> getList() {
        return list;
    }
}
