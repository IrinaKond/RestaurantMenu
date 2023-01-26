package org.restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    //Define custom  toString() method
    @Override
    public String toString() {
        String newText = isNew() ? "- NEW!" : "";
        return name + newText + '\n' +
                description +
                " | " + " $" + price;
    }

    //Define custom equals() method
    @Override
    public boolean equals(Object toBeCompared) {
        //Reference check
        if (this == toBeCompared) {
            return true;
        }

        //Null check
        if (toBeCompared == null) {
            return false;
        }

        //Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }



    // Define instance method isNew()
    boolean isNew() {
        return true;
    }
}
