package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private String name;
    private Date updatedOn;
    private List<MenuItem> menuItemList = new ArrayList<MenuItem>();

    public Menu (String name) {
        this.name = name;
        update();
    }

    private Date update() {
        return this.updatedOn = new Date();
    }
    protected Date getUpdatedOn() {
        return this.updatedOn;
    }
    protected String getName() {return this.name;    }

    protected void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    protected void addToMenu(MenuItem menuItem){
        this.menuItemList.add(menuItem);
    }

    @Override
    public String toString() {
        if (menuItemList == null) {
            return this.name + " (Updated On: " + this.updatedOn + "). \n"+
                    "No Menu Items";
        } else {
            String printStatement = this.name + " (Updated On: " + this.updatedOn + ") \n";
            for(MenuItem item : menuItemList)
                printStatement = printStatement + "Menu Items: " + menuItemList;
            return printStatement;
        }
    }

}
