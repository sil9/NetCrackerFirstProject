package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandType;

public enum MenuType {
    START, OPERATIONS, SEARCH, PRINT, CALCULATE, INPUTNUMBER;

    public Menu getCurrentMenu() {
        switch (this) {
            case START:
                return new Menu()
                        .addCommand("Операции", CommandType.OPERATIONS)
                        .addCommand("Печать", CommandType.PRINT)
                        .setExit(true);
            case CALCULATE:
                return new Menu()
                        .addCommand("Найти максимум", CommandType.FINDMAX)
                        .addCommand("Найти минимум", CommandType.FINDMIN)
                        .addCommand("Найти количество", CommandType.FINDCOUNT)
                        .addCommand("Найти сумму значений", CommandType.FINDSUM)
                        .addCommand("Найти среднее", CommandType.FINDAVERAGE)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.OPERATIONS));
            case OPERATIONS:
                return new Menu()
                        .addCommand("Вычисления значений", CommandType.CALCULATE)
                        .addCommand("Поиск", CommandType.SEARCH)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.START));
            case PRINT:
                return new Menu()
                        .addCommand("Печать массива в прямом порядке", CommandType.PRINTARRAY)
                        .addCommand("Печать массива в обратном порядке", CommandType.PRINTREVERSEARRAY)
                        .addCommand("Печать массива в отсортированном порядке", CommandType.PRINTSORTEDARRAY)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.START));
            case SEARCH:
                return new Menu()
                        .addCommand("Проверить входит ли число в массив", CommandType.CHECKNUMBERINARRAY)
                        .addCommand("Заменить элемент массива на другой", CommandType.UPDATENUBERINARRAY)
                        .setPreviousMenu(MenuFactory.getInstance().create(MenuType.OPERATIONS));
            case INPUTNUMBER:
                return new Menu()
                        .addCommand("", CommandType.INPUTNUMBERCOMMAND)
                        .setChoice(false);
            default:
                return new Menu();
        }
    }
}
