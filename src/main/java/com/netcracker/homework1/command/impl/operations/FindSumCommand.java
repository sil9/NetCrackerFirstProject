package com.netcracker.homework1.command.impl.operations;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.repository.ArrayOfNumbers;

public class FindSumCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма : " + sum);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.OPERATIONS).show();
    }
}
