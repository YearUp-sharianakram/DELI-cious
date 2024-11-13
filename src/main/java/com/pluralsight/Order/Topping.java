package com.pluralsight.Order;

import java.util.HashMap;

public class Topping {
    public final String[] meats = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
    public final String[] cheeses = {"American" , "Provolone", "Cheddar", "Swiss"};
    public final String[] regulars = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
    public final String[] sauces = {"Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Islands","vinaigrette"};
    public final String[] sides = {"au jus", "sauce"};

    public final double singleMeatFourInchPrice = 1.00;
    public final double singleMeatEightInchPrice = 2.00;
    public final double singleMeatTwelveInchPrice = 3.00;

    public final double extraMeatFourInchPrice = .50;
    public final double extraMeatEightInchPrice = 1.00;
    public final double extraMeatTwelveInchPrice = 1.50;

    public final double singleCheeseFourInchPrice = .75;
    public final double singleCheeseEightInchPrice = 1.50;
    public final double singleCheeseTwelveInchPrice = 2.25;

    public final double extraCheeseFourInchPrice = .30;
    public final double extraCheeseEightInchPrice = .60;
    public final double extraCheeseTwelveInchPrice = .90;

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
//
//    public static Topping getMeat(String description){
//        Topping result = new Topping(description, "Meat", 1);
//        return result;
//    }

//    public double getPrice(){
//        return 0;
//    }
}
