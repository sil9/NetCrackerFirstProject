package com.netcracker.lesson2.car;


import com.netcracker.lesson2.Testable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarListTest implements Testable {

    private Car[] array = {
            new Car(1, "Opel", 20.5, 200),
            new Car(2, "BMW", 20.5, 50),
            new Car(3, "Mazda", 15.5, 90),
            new Car(4, "Ferrari", 33.3, 130),
            new Car(4, "Ferrari", 33.3, 130),
    };

    private List<Car> cars = new ArrayList<>();

    @Override
    public void test() {
        addValuesToList(this.array);
        printEntries(this.cars);
    }

    private void printEntries(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Map size: " + this.cars.size());
    }

    private void addValuesToList(Car[] array) {
        cars.addAll(Arrays.asList(array));
    }
}
