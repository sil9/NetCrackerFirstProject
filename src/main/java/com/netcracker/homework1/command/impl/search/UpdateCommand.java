package com.netcracker.homework1.command.impl.search;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;
import com.netcracker.homework1.memory.InputValues;


public class UpdateCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Введите число которое хотите заменить");
        MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
        int inputNumber = InputValues.getList().get(InputValues.getList().size() - 1);
        int[] array = ArrayOfNumbers.getArray();
        int position = 0;
        boolean check = false;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == inputNumber) {
                check = true;
                position = i;
                break;
            }
        }
        if (!check) {
            System.out.println("Такого числа нету");
            System.out.println("-------");
            MenuFactory.getInstance().create(MenuType.SEARCH).show();
        } else {
            System.out.println("Введите число на которое заменить");
            MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
            int replaceableNumber = InputValues.getList().get(InputValues.getList().size() - 1);
            array[position] = replaceableNumber;
            System.out.println("Операция прошла успешно");
            System.out.println("-------");
            MenuFactory.getInstance().create(MenuType.SEARCH).show();
        }
        InputValues.getList().clear();
    }
}
