package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private ArrayList<String> categories;
    protected Double price;
    protected String description;
    protected String category;
    protected Boolean newStatus;

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

    protected Boolean getNewStatus() {
        return(this.newStatus);
    }

    // Setters
    protected void setPrice(Double aprice) {
        this.price = aprice;
    }

    protected void setDescription(String adescription) {
        this.description = adescription;
    }

    protected void setCategory(String acategory){
        this.category = acategory;
    }

    protected void setNewStatus(Boolean anewStatus) {
        this.newStatus = anewStatus;
    }
}
