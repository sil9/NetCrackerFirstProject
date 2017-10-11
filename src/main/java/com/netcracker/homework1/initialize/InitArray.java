package com.netcracker.homework1.initialize;


import com.netcracker.homework1.memory.ArrayOfNumbers;
import com.netcracker.homework1.memory.InputValues;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;

public class InitArray {

    public static void init() {
        initSize();
        initArray();
    }

    private static void initArray() {
        System.out.println("Введите уникальные числа...");
        for (int i = 0; i < ArrayOfNumbers.getArray().length; i++) {
            MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
            int inputNumber = InputValues.getList().get(InputValues.getList().size() - 1);
            for (int num : ArrayOfNumbers.getArray()) {
                if (inputNumber == num) {
                    System.out.println("Число есть в массиве. Введите другое");
                    InputValues.getList().remove(InputValues.getList().size() - 1);
                    i--;
                    break;
                }
            }

            TODO:
            // FIXME: 11.10.2017 тут что-то с нулем
            ArrayOfNumbers.getArray()[i] = inputNumber;
        }
    }

    private static void initSize() {
        System.out.println("Введите размер массива (меньше десяти)...");
        while (true) {
            MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
            int count = InputValues.getList().get(InputValues.getList().size() - 1);
            if (count < 1 | count >= 10) {
                System.out.println("Размер должен быть больше нуля и меньше десяти");
                InputValues.getList().clear();
            } else {
                ArrayOfNumbers.init(count);
                InputValues.getList().clear();
                break;
            }
        }
    }
}
