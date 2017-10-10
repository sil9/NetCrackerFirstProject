package com.netcracker.homework1.command.factory;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.command.impl.*;
import com.netcracker.homework1.command.impl.operations.*;
import com.netcracker.homework1.command.impl.print.PrintArrayCommand;
import com.netcracker.homework1.command.impl.print.PrintReverseArrayCommand;
import com.netcracker.homework1.command.impl.print.PrintSortedArrayCommand;

public enum CommandType {
    FINDMAX, FINDMIN, FINDCOUNT, FINDSUM, FINDAVERAGE, //Вычисления значений

    PRINTARRAY, PRINTREVERSEARRAY, PRINTSORTEDARRAY,   //Печать

    OPERATIONS, PRINT,                                 //Стартовое меню

    START;

    public Command getCurrentCommand() {
        switch (this) {
            case FINDMAX:
                return new FindMaxCommand();
            case FINDMIN:
                return new FindMinCommand();
            case FINDCOUNT:
                return new FindCountCommand();
            case FINDSUM:
                return new FindSumCommand();
            case FINDAVERAGE:
                return new FindAverageCommand();
            case PRINTARRAY:
                return new PrintArrayCommand();
            case PRINTREVERSEARRAY:
                return new PrintReverseArrayCommand();
            case PRINTSORTEDARRAY:
                return new PrintSortedArrayCommand();
            case OPERATIONS:
                return new OperationsCommand();
            case PRINT:
                return new PrintCommand();
            case START:
                return new StartCommand();
            default:
                return new FindMaxCommand();
        }

    }
}
