package com.netcracker.homework1.command.impl;

import com.netcracker.homework1.command.Command;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;

public class SearchCommand implements Command {

    @Override
    public void execute() {
        MenuFactory.getInstance().create(MenuType.SEARCH).show();
    }
}
