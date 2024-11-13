package com.pluralsight.Order;

import java.util.HashMap;

public class Sandwich extends MenuItem {
    public final String[] typesOfBread= {"White", "Wheat", "Rye", "Wrap"};

    private final double fourInchCost = 5.50;
    private final double eightInchCost = 7.00;
    private final double twelveInchCost = 8.50;

    private String breadType;
//    private boolean containsMeat;
//    private boolean containsCheese;
    private HashMap<String, Topping> toppings;

    public Sandwich(String description, String size, String breadType, HashMap<String, Topping> toppings) {
        super(description, size);
        this.breadType = breadType;
        this.toppings = toppings;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
