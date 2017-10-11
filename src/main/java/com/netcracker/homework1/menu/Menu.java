package com.netcracker.homework1.menu;


import com.netcracker.homework1.command.factory.CommandFactory;
import com.netcracker.homework1.command.factory.CommandType;
import com.netcracker.homework1.memory.InputValues;
import com.netcracker.homework1.util.ConsoleReader;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pair<String, CommandType>> commands;
    private ConsoleReader consoleReader;
    private boolean choice;
    private boolean exit;
    private Menu previousMenu;

    private Menu(Builder builder) {
        this.commands = builder.commands;
        this.consoleReader = builder.consoleReader;
        this.choice = builder.choice;
        this.exit = builder.exit;
        this.previousMenu = builder.previous;
    }

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
        if (!isChoice()) {
            InputValues.add(readableNumber);
        }
        CommandFactory.getInstance().create(this, readableNumber).execute();
    }

    public List<Pair<String, CommandType>> getCommands() {
        return commands;
    }

    public Menu getPreviousMenu() {
        return previousMenu;
    }

    public boolean isChoice() {
        return choice;
    }

    public boolean isExit() {
        return exit;
    }

    public static class Builder {
        private List<Pair<String, CommandType>> commands = new ArrayList<>();
        private ConsoleReader consoleReader = new ConsoleReader();
        private boolean choice = true;
        private boolean exit = false;
        private Menu previous;

        public Builder setChoice(boolean choice) {
            this.choice = choice;
            return this;
        }

        public Builder setPreviousMenu(Menu menu) {
            this.previous = menu;
            return this;
        }

        public Builder setExit(boolean bool) {
            this.exit = bool;
            return this;
        }
        public Builder addCommand(String text, CommandType commandType) {
            Pair<String, CommandType> pair = new Pair<>(text, commandType);
            this.commands.add(pair);
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }
    }
}
