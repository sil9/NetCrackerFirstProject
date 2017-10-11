package com.netcracker.homework1.util;


import com.netcracker.homework1.menu.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Integer readableNumber;
    private static final String ERROR = "Выберите из предложенных вариантов";
    private static final String WRITENUMBER = "Введите целое число...";

    public Integer readConsoleLine(Menu menu) {
        try {
            readableNumber = Integer.parseInt(reader.readLine());
            if (menu.isChoice() & (readableNumber < 0 | readableNumber > menu.getCommands().size())) {
                System.out.println(ERROR);
                readConsoleLine(menu);
            }
        } catch (IOException | NumberFormatException e) {
            if (menu.isChoice()) {
                System.out.println(ERROR);
            } else System.out.println(WRITENUMBER);
            readConsoleLine(menu);
        }
        return readableNumber;
    }
}
