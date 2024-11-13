package com.pluralsight.Screens;

import com.pluralsight.util.Console;

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
        while (true) {
            try {

                System.out.println("Please choose one of the following drink size options:");
                System.out.println(" (S) - Small");
                System.out.println(" (M) - Medium");
                System.out.println(" (L) - Medium");
                System.out.println(" (X) - Return back to Order Screen");

                String size = Console.PromptForString("Option: ");
                if (size.equalsIgnoreCase("X")) {
                    SandwichScreen.sandwichScreen();
                }
                else {

                }






                System.out.println("\nWhat drink would you like?");
                for (int i = 1; i < listOfDrinks.length; i++ ){
                    System.out.println(" (" + i + ") " + listOfDrinks[i]);
                }
                System.out.println(" (X) - Return back to Order Screen");



                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("X")) {
                    OrderScreen.orderScreen();
                }
                else
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
