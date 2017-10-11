package com.netcracker.homework1.command.impl.operations;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.memory.ArrayOfNumbers;

public class FindCountCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        int count = array.length;
        System.out.println("Количество : " + count);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.CALCULATE).show();
    }
}
