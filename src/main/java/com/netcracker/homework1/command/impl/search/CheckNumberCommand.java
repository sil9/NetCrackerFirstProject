package com.netcracker.homework1.command.impl.search;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;
import com.netcracker.homework1.memory.InputValues;


public class CheckNumberCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Введите число...");
        MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
        int inputNumber = InputValues.getList().get(InputValues.getList().size() - 1);
        int[] array = ArrayOfNumbers.getArray();
        boolean check = false;
        for (int number : array) {
            if (number == inputNumber) {
                System.out.println("Число есть в массиве");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Числа нету в массиве");
        }
        InputValues.getList().clear();
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.SEARCH).show();
    }
}
