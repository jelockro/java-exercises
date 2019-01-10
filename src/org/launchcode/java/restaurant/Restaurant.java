package org.launchcode.java.restaurant;

import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        Menu japaneseMenu = new Menu("Dojo");
        MenuItem sushi = new MenuItem("sushi", 4.00);
        System.out.println(sushi.toString());
        japaneseMenu.addToMenu(sushi);
        System.out.println(japaneseMenu.toString());
    }

}
