package com.pluralsight.Order;

public class Chips extends MenuItem {
    public final String[] chipNames = {
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
}
