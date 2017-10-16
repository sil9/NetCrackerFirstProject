package com.netcracker.lesson2.car;


import com.netcracker.lesson2.Testable;
import java.util.HashMap;
import java.util.Map;

public class CarMapTest implements Testable {

    private Car[] array = {
            new Car(1, "Opel", 20.5, 200),
            new Car(2, "BMW", 21.5, 50),
            new Car(3, "Mazda", 15.5, 90),
            new Car(4, "Ferrari", 33.3, 130),
            new Car(4, "Ferrari", 33.3, 130),
    };

    private Map<String, Car> cars = new HashMap<>();

    @Override
    public void test() {
        addValuesToMap(array);
        printEntries(cars);
    }

    private void printEntries(Map<String, Car> map) {
        for (Map.Entry<String, Car> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Map size: " + map.size());
    }

    private void addValuesToMap(Car[] array) {
        for (Car car : array) {
            this.cars.put(car.getName(), car);
        }
    }
}
