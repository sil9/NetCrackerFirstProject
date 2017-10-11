package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandType;

public enum MenuType {
    START, OPERATIONS, SEARCH, PRINT, CALCULATE, INPUTNUMBER;

    public Menu getCurrentMenu() {
        switch (this) {
            case START:
                return new Menu.Builder()
                        .addCommand("Операции", CommandType.OPERATIONS)
                        .addCommand("Печать", CommandType.PRINT)
                        .setExit(true)
                        .build();
            case CALCULATE:
                return new Menu.Builder()
                        .addCommand("Найти максимум", CommandType.FINDMAX)
                        .addCommand("Найти минимум", CommandType.FINDMIN)
                        .addCommand("Найти количество", CommandType.FINDCOUNT)
                        .addCommand("Найти сумму значений", CommandType.FINDSUM)
                        .addCommand("Найти среднее", CommandType.FINDAVERAGE)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.OPERATIONS))
                        .build();
            case OPERATIONS:
                return new Menu.Builder()
                        .addCommand("Вычисления значений", CommandType.CALCULATE)
                        .addCommand("Поиск", CommandType.SEARCH)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.START))
                        .build();
            case PRINT:
                return new Menu.Builder()
                        .addCommand("Печать массива в прямом порядке", CommandType.PRINTARRAY)
                        .addCommand("Печать массива в обратном порядке", CommandType.PRINTREVERSEARRAY)
                        .addCommand("Печать массива в отсортированном порядке", CommandType.PRINTSORTEDARRAY)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.START))
                        .build();
            case SEARCH:
                return new Menu.Builder()
                        .addCommand("Проверить входит ли число в массив", CommandType.CHECKNUMBERINARRAY)
                        .addCommand("Заменить элемент массива на другой", CommandType.UPDATENUBERINARRAY)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.OPERATIONS))
                        .build();
            case INPUTNUMBER:
                return new Menu.Builder()
                        .addCommand("", CommandType.INPUTNUMBERCOMMAND)
                        .setChoice(false)
                        .build();
            default:
                return new Menu.Builder().build();
        }
    }
}
