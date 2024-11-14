package com.pluralsight.Order;

import java.util.HashMap;

public class Sandwich extends MenuItem {
    public final String[] typesOfBread= {"White", "Wheat", "Rye", "Wrap"};

    private final double fourInchCost = 5.50;
    private final double eightInchCost = 7.00;
    private final double twelveInchCost = 8.50;

    private String breadType;
    private boolean containsMeat;
    private boolean containsCheese;
    private HashMap<String, Topping> toppings;

    public Sandwich(String description, String size, String breadType){
        super(description, size);
        this.breadType = breadType;
        this.containsMeat = false;
        this.containsCheese = false;
        this.toppings = new HashMap<>();
    }

    @Override
    public double getPrice() {
        double cost = 0.0;
        double singleMeatCost;
        double extraMeatCost;
        double singleCheeseCost;
        double extraCheeseCost;

        if(this.getSize().equalsIgnoreCase("Small")){
            cost = fourInchCost;
            singleMeatCost = Topping.singleMeatFourInchPrice;
            extraMeatCost = Topping.extraMeatFourInchPrice;
            singleCheeseCost = Topping.singleCheeseFourInchPrice;
            extraCheeseCost = Topping.extraCheeseFourInchPrice;
        }else if(this.getSize().equalsIgnoreCase("Medium")){
            cost = eightInchCost;
            singleMeatCost = Topping.singleMeatEightInchPrice;
            extraMeatCost = Topping.extraMeatEightInchPrice;
            singleCheeseCost = Topping.singleCheeseEightInchPrice;
            extraCheeseCost = Topping.extraCheeseEightInchPrice;
        }else{
            cost = twelveInchCost;
            singleMeatCost = Topping.singleMeatTwelveInchPrice;
            extraMeatCost = Topping.extraMeatTwelveInchPrice;
            singleCheeseCost = Topping.singleCheeseTwelveInchPrice;
            extraCheeseCost = Topping.extraCheeseTwelveInchPrice;

        }


        for (String key : toppings.keySet()){
            Topping currentTopping = toppings.get(key);
            if (currentTopping.getType().equals("Meat")){
                if(this.containsMeat){
                    cost = cost + extraMeatCost;
                }else {
                    cost = cost + singleMeatCost;
                }
            } else if(currentTopping.getType().equals("Cheese")){
                if(this.containsCheese){
                    cost = cost + extraCheeseCost;
                }else {
                    cost = cost + singleCheeseCost;
                }
            }
        }
        return cost;
    }
}
