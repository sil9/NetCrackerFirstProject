package com.netcracker.homework1.command.impl.print;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;
import com.netcracker.homework1.repository.ArrayOfNumbers;

public class PrintArrayCommand implements Command {

    @Override
    public void execute() {
        int[] array = ArrayOfNumbers.getArray();
        for (int i = 0; i < array.length - 1 ; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
        System.out.println("-------");
        MenuFactory.getInstance().create(MenuType.PRINT).show();
    }
}
