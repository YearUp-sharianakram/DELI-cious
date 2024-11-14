package com.pluralsight.Screens;

import com.pluralsight.Order.*;
import com.pluralsight.util.*;

public class DrinkScreen {
    public static final String[] listOfDrinks = {
            "Water",
            "Lemonade",
            "Iced Tea",
            "Orange Juice",
            "Apple Juice",
            "Soda",
            "Sparkling Water",
            "Milk",
            "Smoothie",
            "Hot Chocolate"
    };


    public static void drinkScreen() {
        String size = "";
        while (true) {
            try {

                while(size.isEmpty()) {
                    System.out.println("Please choose one of the following drink size options:");
                    System.out.println(" (S) - Small");
                    System.out.println(" (M) - Medium");
                    System.out.println(" (L) - Medium");
                    System.out.println(" (X) - Return back to Order Screen");

                    String option = Console.PromptForString("Option: ");
                    if (option.equalsIgnoreCase("X")) {
                        OrderScreen.orderScreen();
                        break;
                    } else if (option.equalsIgnoreCase("S") || option.equalsIgnoreCase("small")) {
                        size = "Small";
                        break;
                    } else if (option.equalsIgnoreCase("M") || option.equalsIgnoreCase("medium")) {
                        size = "Medium";
                        break;
                    } else if (option.equalsIgnoreCase("L") || option.equalsIgnoreCase("Large")) {
                        size = "Large";
                        break;
                    } else {
                        System.out.println("Invalid Command");
                    }
                }



                System.out.println("\nWhat drink would you like?");
                for (int i = 0; i < listOfDrinks.length; i++ ){
                    System.out.println(" (" + (i+1) + ") " + listOfDrinks[i]);
                }
                System.out.println(" (X) - Return back to Order Screen");



                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("X")) {
                    OrderScreen.orderScreen();
                    break;
                }
                else{
                    int choice = Integer.parseInt(selection);
                    if (choice > listOfDrinks.length){
                        System.out.println("Invalid Command");
                    }else{
                        String drinkName = listOfDrinks[choice - 1];
                        boolean isIced = Console.PromptForYesNo("Would you like Ice with your drink?");
                        Drink makeDrink = new Drink(drinkName, size, isIced);
                        OrderScreen.items.add(makeDrink);
                        System.out.println("Successfully added drink!!!");
                        size = "";
                        }
                    }




            } catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }
    }

    public static String getDrinkSize(){
        System.out.println("Please choose one of the following drink size options:");
        System.out.println(" (S) - Small");
        System.out.println(" (M) - Medium");
        System.out.println(" (L) - Medium");
        System.out.println(" (X) - Return back to Order Screen");
        return Console.PromptForString("Size: ");
    }
}
