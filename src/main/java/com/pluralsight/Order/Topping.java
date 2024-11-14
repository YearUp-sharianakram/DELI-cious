package com.pluralsight.Order;

import java.util.HashMap;

public class Topping {
    public static final String[] meats = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    public static final String[] cheeses = {"American" , "Provolone", "Cheddar", "Swiss"};
    public static final String[] regulars = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
    public static final String[] sauces = {"Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands","vinaigrette"};
    public static final String[] sides = {"au jus", "sauce"};

    public static final double singleMeatFourInchPrice = 1.00;
    public static final double singleMeatEightInchPrice = 2.00;
    public static final double singleMeatTwelveInchPrice = 3.00;

    public static final double extraMeatFourInchPrice = .50;
    public static final double extraMeatEightInchPrice = 1.00;
    public static final double extraMeatTwelveInchPrice = 1.50;

    public static final double singleCheeseFourInchPrice = .75;
    public static final double singleCheeseEightInchPrice = 1.50;
    public static final double singleCheeseTwelveInchPrice = 2.25;

    public static final double extraCheeseFourInchPrice = .30;
    public static final double extraCheeseEightInchPrice = .60;
    public static final double extraCheeseTwelveInchPrice = .90;

    private String description;
    private String type; // Meat, Cheese, Veggie, Sauce
    private int quantity;




    public Topping(String description, String type, int quantity) {
        this.description = description;
        this.type = type;
        this.quantity = quantity;
    }

    public Topping(String description, String type) {
        this.description = description;
        this.type = type;
        this.quantity = 1;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
//
//    public static Topping getMeat(String description){
//        Topping result = new Topping(description, "Meat", 1);
//        return result;
//    }

//    public double getPrice(){
//
//    }
}
