package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandFactory;
import com.netcracker.homework1.command.factory.CommandType;
import com.netcracker.homework1.memory.InputValues;
import com.netcracker.homework1.util.ConsoleReader;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pair<String, CommandType>> commands = new ArrayList<>();
    private ConsoleReader consoleReader = new ConsoleReader();
    private boolean choice = true;
    private boolean exit = false;
    private Menu previousMenu;

    public void show() {
        if (choice) {
            int i = 1;
            for (Pair pair : commands) {
                System.out.println(i + ". " + pair.getKey());
                i++;
            }
            if (previousMenu != null) {
                System.out.println("0. Назад");
            } else if (exit) {
                System.out.println("0. Выход");
            }
            System.out.println("Выберите значение...");
        }
        read();
    }

    private void read() {
        Integer readableNumber = consoleReader.readConsoleLine(this);
        if (!isChoice()){
            InputValues.add(readableNumber);
        }
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

    public boolean isChoice() {
        return choice;
    }

    public Menu setChoice(boolean choice) {
        this.choice = choice;
        return this;
    }

    public Menu setPreviousMenu(Menu menu) {
        previousMenu = menu;
        return this;
    }

    public Menu setExit (boolean bool) {
        exit = bool;
        return this;
    }

    public Menu getPreviousMenu() {
        return previousMenu;
    }

    public boolean isExit() {
        return exit;
    }
}
