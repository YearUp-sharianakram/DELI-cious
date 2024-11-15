package com.pluralsight.Order;

public class Chips extends MenuItem {
    public static final String[] chipFlavors = {
            "Classic",
            "Sour Cream & Onion",
            "Barbecue",
            "Salt & Vinegar",
            "Cheddar & Sour Cream",
            "Spicy Nacho",
            "Buffalo Ranch",
            "Honey BBQ",
            "Cool Ranch",
            "Dill Pickle"
    };
    public final double chipsCost = 1.50;


    public Chips(String description) {
        super(description, null);
    }

    @Override
    public double getPrice() {
        return chipsCost;
    }

    @Override
    public String toString() {
        return  this.getDescription() + " -  $" + String.format("%.2f", this.getPrice());
    }
}
