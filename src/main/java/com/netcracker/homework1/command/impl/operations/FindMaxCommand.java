package com.netcracker.homework1.command.impl.operations;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.repository.ArrayOfNumbers;

public class FindMaxCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальное число : " + max);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.OPERATIONS).show();
    }
}
