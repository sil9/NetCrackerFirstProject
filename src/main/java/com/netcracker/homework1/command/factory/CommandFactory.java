package com.netcracker.homework1.command.factory;


import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.Menu;
import com.netcracker.homework1.util.MenuParameterParser;

public class CommandFactory {

    private static class CommandFactoryHolder{
        private static CommandFactory INSTANCE = new CommandFactory();
    }

    public static CommandFactory getInstance(){
        return CommandFactoryHolder.INSTANCE;
    }

    public Command create(Menu menu, int number){
        Command command = null;
        CommandType commandType = MenuParameterParser.getCommandType(menu, number);
        command = commandType.getCurrentCommand();
        return command;
    }
}
