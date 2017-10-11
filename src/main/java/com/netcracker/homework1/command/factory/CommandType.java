package com.netcracker.homework1.command.factory;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.command.impl.*;
import com.netcracker.homework1.command.impl.operations.*;
import com.netcracker.homework1.command.impl.print.PrintArrayCommand;
import com.netcracker.homework1.command.impl.print.PrintReverseArrayCommand;
import com.netcracker.homework1.command.impl.print.PrintSortedArrayCommand;
import com.netcracker.homework1.command.impl.search.CheckNumberCommand;
import com.netcracker.homework1.command.impl.search.UpdateCommand;

public enum CommandType {
    FINDMAX, FINDMIN, FINDCOUNT, FINDSUM, FINDAVERAGE, PRINTARRAY, PRINTREVERSEARRAY, PRINTSORTEDARRAY,

    OPERATIONS, PRINT, START, SEARCH, CALCULATE, CHECKNUMBERINARRAY, UPDATENUBERINARRAY, INPUTNUMBERCOMMAND;

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
            case SEARCH:
                return new SearchCommand();
            case CALCULATE:
                return new CalculateCommand();
            case CHECKNUMBERINARRAY:
                return new CheckNumberCommand();
            case UPDATENUBERINARRAY:
                return new UpdateCommand();
            case INPUTNUMBERCOMMAND:
                return new InputNumberCommand();
            default:
                return new FindMaxCommand();
        }

    }
}
