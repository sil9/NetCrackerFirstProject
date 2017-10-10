package com.netcracker.homework1.menu;


public class MenuFactory {

    private static class MenuFactoryHolder {
        private static MenuFactory INSTANCE = new MenuFactory();
    }

    public static MenuFactory getInstance() {
        return MenuFactoryHolder.INSTANCE;
    }

    public Menu create(MenuType menuType){
        return menuType.getCurrentMenu();
    }
}
