package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandType;

public enum MenuType {
    START, OPERATIONS, SEARCH, PRINT;

    public Menu getCurrentMenu() {
        switch (this) {
            case START:
                return new Menu()
                        .addCommand("Операции", CommandType.OPERATIONS)
                        .addCommand("Печать", CommandType.PRINT);
            case OPERATIONS:
                return new Menu()
                        .addCommand("Найти максимум", CommandType.FINDMAX)
                        .addCommand("Найти минимум", CommandType.FINDMIN)
                        .addCommand("Найти количество", CommandType.FINDCOUNT)
                        .addCommand("Найти сумму значений", CommandType.FINDSUM)
                        .addCommand("Найти среднее", CommandType.FINDAVERAGE);
            case PRINT:
                return new Menu()
                        .addCommand("Печать массива в прямом порядке", CommandType.PRINTARRAY)
                        .addCommand("Печать массива в обратном порядке", CommandType.PRINTREVERSEARRAY)
                        .addCommand("Печать массива в отсортированном порядке", CommandType.PRINTSORTEDARRAY);
            default:
                return new Menu();
        }
    }
}
