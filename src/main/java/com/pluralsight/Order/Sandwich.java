package com.pluralsight.Order;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Sandwich extends MenuItem {
    public static final String[] typesOfBread = {"White", "Wheat", "Rye", "Wrap"};

    private final double fourInchCost = 5.50;
    private final double eightInchCost = 7.00;
    private final double twelveInchCost = 8.50;

    private String breadType;
    private Boolean isToasted;
    private boolean containsMeat;
    private boolean containsCheese;
    private HashMap<String, Topping> toppings;

    public Sandwich(String size, String breadType, boolean isToasted) {
        super("Sandwich", size);
        this.breadType = breadType;
        this.containsMeat = false;
        this.containsCheese = false;
        this.isToasted = isToasted;
        this.toppings = new HashMap<>();
    }

    @Override
    public double getPrice() {
        double cost = 0.0;
        double singleMeatCost;
        double extraMeatCost;
        double singleCheeseCost;
        double extraCheeseCost;

        if (this.getSize().equalsIgnoreCase("Small")) {
            cost = fourInchCost;
            singleMeatCost = Topping.singleMeatFourInchPrice;
            extraMeatCost = Topping.extraMeatFourInchPrice;
            singleCheeseCost = Topping.singleCheeseFourInchPrice;
            extraCheeseCost = Topping.extraCheeseFourInchPrice;
        } else if (this.getSize().equalsIgnoreCase("Medium")) {
            cost = eightInchCost;
            singleMeatCost = Topping.singleMeatEightInchPrice;
            extraMeatCost = Topping.extraMeatEightInchPrice;
            singleCheeseCost = Topping.singleCheeseEightInchPrice;
            extraCheeseCost = Topping.extraCheeseEightInchPrice;
        } else {
            cost = twelveInchCost;
            singleMeatCost = Topping.singleMeatTwelveInchPrice;
            extraMeatCost = Topping.extraMeatTwelveInchPrice;
            singleCheeseCost = Topping.singleCheeseTwelveInchPrice;
            extraCheeseCost = Topping.extraCheeseTwelveInchPrice;

        }


        for (String key : toppings.keySet()) {
            Topping currentTopping = toppings.get(key);
            if (currentTopping.getType().equals("Meat")) {
                if (this.containsMeat) {
                    cost = cost + extraMeatCost;
                } else {
                    cost = cost + singleMeatCost;
                }
            } else if (currentTopping.getType().equals("Cheese")) {
                if (this.containsCheese) {
                    cost = cost + extraCheeseCost;
                } else {
                    cost = cost + singleCheeseCost;
                }
            }
        }
        return cost;
    }


    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public Boolean getToasted() {
        return isToasted;
    }

    public void setToasted(Boolean toasted) {
        isToasted = toasted;
    }

    public boolean isContainsMeat() {
        return containsMeat;
    }

    public void setContainsMeat(boolean containsMeat) {
        this.containsMeat = containsMeat;
    }

    public boolean isContainsCheese() {
        return containsCheese;
    }

    public void setContainsCheese(boolean containsCheese) {
        this.containsCheese = containsCheese;
    }

    public HashMap<String, Topping> getToppings() {
        return toppings;
    }

    public void setToppings(HashMap<String, Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        StringBuilder statement = new StringBuilder();
        if (this.isToasted){
            statement.append("Toasted");
        }else{
            statement.append("Not Toasted");
        }

        if (this.getSize().equalsIgnoreCase("small")){
            statement.append(" 4\" ");
        } else if((this.getSize().equalsIgnoreCase("medium"))){
            statement.append(" 8\" ");
        }else{
            statement.append(" 12\" ");
        }
        statement.append(this.breadType);
        for (Topping topping : (this.toppings).values()){
            statement.append("\n    ").append(topping);
        }
        return statement.toString();

    }
}