package com.netcracker.homework1.command.impl.operations;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;

public class FindMinCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Минимальное число : " + min);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.CALCULATE).show();
    }
}
