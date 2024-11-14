package com.pluralsight.Order;

public abstract class MenuItem {
    private String description;
    private String size;

    public MenuItem(String description, String size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }



    public abstract double getPrice();
}
