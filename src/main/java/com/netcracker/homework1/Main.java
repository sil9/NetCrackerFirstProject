package com.netcracker.homework1;


import com.netcracker.homework1.menu.MenuFactory;
import com.netcracker.homework1.menu.MenuType;


public class Main {
    public static void main(String[] args) {
        MenuFactory.getInstance().create(MenuType.START).show();
    }
}
