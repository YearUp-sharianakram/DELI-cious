package com.pluralsight.Screens;

import com.pluralsight.Order.*;
import com.pluralsight.util.*;

import java.util.ArrayList;

public class OrderScreen {
    public static ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public static void orderScreen() {
        while (true) {
            try {
                System.out.println("\nWhat would you like to order today?");
                System.out.println(" (1)- Add Sandwich");
                System.out.println(" (2)- Add Drink");
                System.out.println(" (3)- Add Chips");
                System.out.println(" (4)- View Cart");
                System.out.println(" (5)- Checkout");
                System.out.println(" (0)- Cancel Order"); // return back to home screen


                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("1")) {
                    SandwichScreen.sandwichScreen();

                }
                else if (selection.equalsIgnoreCase("2")) {
                    DrinkScreen.drinkScreen();

                }
                else if (selection.equalsIgnoreCase("3")) {
                    ChipsScreen.chipsScreen();

                }
                else if (selection.equalsIgnoreCase("4")) {
                    displayCurrentItems();

                }
                else if (selection.equalsIgnoreCase("5")) {
                    CheckoutScreen.checkoutScreen();
                    break;

                }
                else if (selection.equalsIgnoreCase("0")) {
                    items = new ArrayList<>();
                    HomeScreen.homeScreen();
                    break;
                } else {
                    System.out.println("Invalid Command");
                }
            } catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }
    }

    public static void displayCurrentItems(){
        System.out.println("Current Cart: ");
        for(MenuItem item: items){
            System.out.println(item);
        }
        System.out.println("----------------------------");
        System.out.printf("Total: $%.2f", getTotalPrice());
        System.out.println();
    }

    public static double getTotalPrice(){
        double total = 0.0;
        for(MenuItem item : items){
            total = total + item.getPrice();
        }
        return total;
    }
}
