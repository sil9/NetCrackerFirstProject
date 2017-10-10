package com.netcracker.homework1.command.impl.print;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.repository.ArrayOfNumbers;


public class PrintReverseArrayCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        for (int i = array.length - 1; i > 0 ; i--){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[0]);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.PRINT).show();
    }
}
