package com.netcracker.homework2;


import java.util.*;

public class Main {
    private static List<Entity> list;
    private static Map<String, Entity> map;
    private static ListOperation<Entity> listOperation;
    private static MapOperation<String, Entity> mapOperation;

    public static void main(String[] args) {
        init();

        print("Исходных лист : " + list.toString());

        print("Удаление объекта с наименьшим значением");
        listOperation.deleteByMinField(list);
        print(list);

        print("Удаление объекта с наибольшим значением");
        listOperation.deleteByMaxField(list);
        print(list);

        print("Удаление из коллекции всех значений со значением поля больше X");
        listOperation.deleteByValue(list, 7);
        print(list);

        print("Посчитать сумму");
        print(listOperation.calculateSum(list));

        print("Вернуть третий элемент коллекции по порядку");
        print(listOperation.getThird(list));

        print("Вернуть два элемента начиная со второго");
        print(listOperation.getTwoFromSecond(list));

        print("Выбрать все элементы по шаблону(размер имени меньше или раве пяти)");
        print(listOperation.getAllByTemplate(list));

        print("Найти есть ли символ «{любой символ}» у всех элементов коллекции");
        print(listOperation.findSymbolInAllItems(list, '!'));

        print("Добавить \"_1\" к имени каждого элементу первой коллекции");
        listOperation.addSymbolToName(list);
        print(list);

        print("Отсортировать");
        listOperation.sorted(list);
        print(list);


//        print("Исходная мапа : "map);
//        print("Удаление объекта с наименьшим значением");
//        mapOperation.deleteByMinField(map);
//        print(map);
//
//        print("Удаление объекта с наибольшим значением");
//        mapOperation.deleteByMaxField(map);
//        print(map);
//
//        print("Удаление из коллекции всех значений со значением поля больше X");
//        mapOperation.deleteByValue(map, 7);
//        print(map);
//
//        print("Посчитать сумму");
//        print(mapOperation.calculateSum(map));
//
//        print("Вернуть третий элемент коллекции по порядку");
//        print(mapOperation.getThird(map));
//
//        print("Вернуть два элемента начиная со второго");
//        print(mapOperation.getTwoFromSecond(map));
//
//        print("Выбрать все элементы по шаблону(размер имени меньше или раве пяти)");
//        print(mapOperation.getAllByTemplate(map));
//
//        print("Найти есть ли символ «{любой символ}» у всех элементов коллекции");
//        print(mapOperation.findSymbolInAllItems(map, '!'));
//
//        print("Отсортировать");
//        mapOperation.sorted(map);
//        print(map);

    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static void print(long num) {
        System.out.println(num);
    }

    private static void init() {
        list = new ArrayList<>(Arrays.asList(
                new Entity("!three", 3),
                new Entity("!one", 1),
                new Entity("!five", 5),
                new Entity("!eight", 8),
                new Entity("!two", 2),
                new Entity("!four", 4),
                new Entity("!six", 6),
                new Entity("!nine", 9),
                new Entity("!seven", 7)
        ));

        map = new HashMap<>();
        list.forEach(entity -> map.put(entity.getName(), entity));

        listOperation = new EntityListOperation();
        mapOperation = new EntityMapOperation();
    }

}
