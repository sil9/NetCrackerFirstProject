package com.netcracker.homework1.command.impl.search;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;
import com.netcracker.homework1.memory.InputValues;


public class UpdateCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Введите число которое хотите заменить...");
        int putNumber = readIntFromConsole();
        int position = checkNumberInArray(putNumber);
        if (position == -1) {
            System.out.println("Такого числа нету");
            System.out.println("-------");
            MenuFactory.getInstance().create(MenuType.SEARCH).show();
        } else {
            System.out.println("Введите число на которое хотите заменить");
            int replaceNumber = readIntFromConsole();
            int result = checkNumberInArray(replaceNumber);
            if (result != -1) {
                System.out.println("Такое число уже есть в массиве. (должен оставаться уникальным)");
                System.out.println("-------");
                MenuFactory.getInstance().create(MenuType.SEARCH).show();
            } else {
                ArrayOfNumbers.getArray()[position] = replaceNumber;
                System.out.println("Операция прошла успешно");
                System.out.println("-------");
                MenuFactory.getInstance().create(MenuType.SEARCH).show();
            }
        }
    }

    private int readIntFromConsole() {
        MenuFactory.getInstance().create(MenuType.INPUTNUMBER).show();
        int num = InputValues.getList().get(InputValues.getList().size() - 1);
        InputValues.getList().clear();
        return num;
    }

    private int checkNumberInArray(int number) {
        int position = -1;
        for (int i = 0; i < ArrayOfNumbers.getArray().length; i++) {
            if (number == ArrayOfNumbers.getArray()[i]) {
                position = i;
            }
        }
        return position;
    }

}

