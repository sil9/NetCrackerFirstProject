package com.netcracker.homework1;

import com.netcracker.homework1.initialize.InitArray;
import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;

public class Main {
    public static void main(String[] args) {
        InitArray.init();
        MenuFactory.getInstance().create(MenuType.START).show();
    }
}
