package com.pluralsight.Order;

public class Drink extends MenuItem {
    private boolean containsIce;

    private final double smallPrice = 2.00;
    private final double mediumPrice = 2.50;
    private final double largePrice = 3.00;

    public Drink(String description, String size, boolean containsIce) {
        super(description, size);
        this.containsIce = containsIce;
    }

    public double getPrice(){
        String size = this.getSize();
        if (size.equalsIgnoreCase("small")){
            return smallPrice;
        }else if(size.equalsIgnoreCase("medium")){
            return mediumPrice;
        }else{
            return largePrice;
        }
    }

    @Override
    public String toString(){
        String drinkStatement = this.getSize() + " " + this.getDescription();
        if (this.containsIce){
            drinkStatement = drinkStatement + " (Iced)";
        }else{
            drinkStatement = drinkStatement + " (Not Iced)";
        }
        return String.format("%s -  $%.2f", drinkStatement, this.getPrice());

    }
}
