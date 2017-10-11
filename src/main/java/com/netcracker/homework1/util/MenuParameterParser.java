package com.netcracker.homework1.util;


import com.netcracker.homework1.command.factory.CommandType;
import com.netcracker.homework1.menu.Menu;
import javafx.util.Pair;

import java.util.List;

public class MenuParameterParser {

    public static CommandType getCommandType(Menu menu, int number) {
        List<Pair<String, CommandType>> commands = menu.getCommands();
        if (menu.isChoice()) {
            if (menu.isExit() & number == 0) {
                System.exit(0);
            }
            if (number == 0 & menu.getPreviousMenu() != null){
                menu.getPreviousMenu().show();
            }
            return commands.get(number - 1).getValue();
        } else return commands.get(0).getValue();
    }

}
