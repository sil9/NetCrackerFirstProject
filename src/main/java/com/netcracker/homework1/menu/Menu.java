package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandFactory;
import com.netcracker.homework1.command.factory.CommandType;
import com.netcracker.homework1.util.ConsoleReader;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pair<String, CommandType>> commands = new ArrayList<>();
    private ConsoleReader consoleReader = new ConsoleReader();

    public void show() {
        int i = 1;
        for (Pair pair : commands) {
            System.out.println(i + ". " + pair.getKey());
            i++;
        }
        System.out.println("Выберите значение...");
        read();
    }

    private void read(){
        Integer readableNumber = consoleReader.readConsoleLine(this);
        CommandFactory.getInstance().create(this, readableNumber).execute();
    }

    public Menu addCommand(String text, CommandType commandType) {
        Pair<String, CommandType> pair = new Pair<>(text, commandType);
        commands.add(pair);
        return this;
    }

    public List<Pair<String, CommandType>> getCommands() {
        return commands;
    }
}
