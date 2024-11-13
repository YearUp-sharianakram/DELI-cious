package com.pluralsight.Order;

public class Topping extends Sandwich {
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

    public static Topping getMeat(String description){
        Topping result = new Topping(description, "Meat", 1);
        return result;
    }

    public double getPrice(){
        return 0;
    }
}
