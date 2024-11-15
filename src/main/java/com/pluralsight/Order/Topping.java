package com.pluralsight.Order;

import java.util.HashMap;

public class Topping {
    public static final String[] meats = {"steak", "ham", "salami", "roast beef", "chicken", "bacon"};
    public static final String[] cheeses = {"american", "provolone", "cheddar", "swiss"};
    public static final String[] regulars = {"lettuce", "peppers", "onions", "tomatoes", "jalapenos", "cucumbers", "pickles", "guacamole", "mushrooms"};
    public static final String[] sauces = {"mayo", "mustard", "ketchup", "ranch", "thousand islands", "vinaigrette"};
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

    public void addQuantity() {
        this.quantity += 1;
    }

//
    public static Topping createMeat(String description){
        return new Topping(description, "Meat", 1);
    }

    public static Topping createCheese(String description){
        return new Topping(description, "Cheese", 1);
    }
    public static Topping createRegular(String description){
        return new Topping(description, "Regular", 1);
    }
    public static Topping createSauce(String description){
        return new Topping(description, "Sauces", 1);
    }
    public static Topping createSide(String description){
        return new Topping(description, "Sides", 1);
    }



    @Override
    public String toString(){
        return quantity + "x " + this.description + "(" + this.type+")";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
