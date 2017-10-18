package com.netcracker.homework2;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Entity> list = new ArrayList<>(Arrays.asList(
                new Entity("!third", 3),
                new Entity("!first", 1),
                new Entity("!first", 1),
                new Entity("!second", 2),
                new Entity("!fourth", 4)
        ));

        Map<String, Entity> map = new HashMap<>();
        list.forEach(entity -> map.put(entity.getName(), entity));

//        System.out.println(list);
//        ListOperation<Entity> listOperation = new EntityListStreamOperation();
//        boolean symbolInAllItems = listOperation.findSymbolInAllItems(list, '!');
//        System.out.println(symbolInAllItems);


        System.out.println(map);
        MapOperation<String, Entity> mapOperation = new EntityMapStreamOperation();
        Map<String, Entity> l = mapOperation.sorted(map);
        System.out.println(l);

    }

}
