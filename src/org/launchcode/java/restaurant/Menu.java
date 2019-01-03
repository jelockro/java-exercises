package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date updatedOn;
    private ArrayList<MenuItem> menuItemList;

    protected Date getUpdatedOn() {
        return(this.updatedOn);
    }

    protected void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    protected void addToMenu(MenuItem menuItem){
        menuItemList.add(menuItem);
    }
}
