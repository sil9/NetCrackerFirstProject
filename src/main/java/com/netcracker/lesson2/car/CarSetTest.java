package com.netcracker.lesson2.car;


import com.netcracker.lesson2.Testable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CarSetTest implements Testable {

    private Car[] array = {
            new Car(1, "Opel", 20.5, 200),
            new Car(2, "BMW", 21.5, 50),
            new Car(3, "Mazda", 15.5, 90),
            new Car(4, "Ferrari", 33.3, 130),
            new Car(4, "Ferrari", 33.3, 130),
    };

    private Set<Car> cars = new HashSet<>();

    @Override
    public void test() {
        addValuesToSet(array);
        printEntries(cars);
    }

    private void addValuesToSet(Car[] array) {
        cars.addAll(Arrays.asList(array));
    }

    private void printEntries(Set<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + cars.size());
    }
}
