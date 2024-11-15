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

    private HashMap<String, Topping> toppings;

    public Sandwich(String size, String breadType, boolean isToasted) {
        super("Sandwich", size);
        this.breadType = breadType;

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

        boolean hasMeat = false;
        boolean hasCheese = false;

        for (String key : toppings.keySet()) {
            Topping currentTopping = toppings.get(key);
            if (currentTopping.getType().equals("Meat")) {
                for(int i = 1; i <= currentTopping.getQuantity(); i++){
                    if (hasMeat) {
                        cost = cost + extraMeatCost;
                    } else {
                        cost = cost + singleMeatCost;
                        hasMeat = true;
                    }
                }
            } else if (currentTopping.getType().equals("Cheese")) {
                for(int i = 1; i <= currentTopping.getQuantity(); i++) {
                    if (hasCheese) {
                        cost = cost + extraCheeseCost;
                    } else {
                        cost = cost + singleCheeseCost;
                        hasCheese = true;
                    }
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

    public HashMap<String, Topping> getToppings() {
        return toppings;
    }

    public void setToppings(HashMap<String, Topping> toppings) {
        this.toppings = toppings;
    }

    public void displayToppings() {
        if (!toppings.isEmpty()) {
        System.out.println("Toppings");
        System.out.println("-------------------");

            for (Topping topping : toppings.values())
                System.out.println(topping);
        }
    }

    public void removeTopping(String removedTopping){
        if (this.toppings.containsKey(removedTopping)) {
            Topping current = toppings.get(removedTopping);
            if (current.getQuantity() > 1){
                current.setQuantity(current.getQuantity() - 1);
            }else{
                this.toppings.remove(removedTopping);
            }
        }else{
            System.out.println("Topping not found");
        }
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
        statement.append(String.format(" -  $" + String.format("%.2f", this.getPrice())));
        for (Topping topping : (this.toppings).values()){
            statement.append("\n    ").append(topping);
        }
        return statement.toString();

    }
}