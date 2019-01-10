package org.launchcode.java.restaurant;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private ArrayList<String> categories;
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;
    private boolean newStatus = false;


    // constructor
    public MenuItem(String name, double price) {
        this.dateAdded = new Date();
        this.name = name;
        this.price = price;
    }


    // Add to category ArrayList
    protected void addToCategories(ArrayList<String> categoryAdditions) {
        for(String category : categoryAdditions) {
            categories.add(category);
        }
    }

    // Getters
    protected Double getPrice() {
        return(this.price);
    }

    protected String getDescription() {
        return(this.description);
    }

    protected String getCategory() {
        return(this.category);
    }

    protected Date getDateAdded() {
        return(this.dateAdded);
    }

    // Setters
    protected void setPrice(Double aPrice) { this.price = aPrice; }

    protected void setDescription(String aDescription) {
        this.description = aDescription;
    }

    protected void setCategory(String aCategory){
        this.category = aCategory;
    }

    protected void setNewStatus(Boolean aNewStatus) {
        this.newStatus = aNewStatus;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormatter = new DecimalFormat("#0.00");
        return " " + this.name + " | $" + currencyFormatter.format(this.price) + " | (Updated On: " + this.dateAdded + ")";
    }
}
