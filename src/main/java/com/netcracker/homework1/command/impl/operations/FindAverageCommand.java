package com.netcracker.homework1.command.impl.operations;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;

public class FindAverageCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        double averageNumber = sum / array.length;
        System.out.println("Среднее значение : " + averageNumber);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.CALCULATE).show();
    }
}
