package com.pluralsight.Screens;

import com.pluralsight.Order.*;
import com.pluralsight.util.*;

//import com.pluralsight.Order.MenuItem;

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
                System.out.println(" (4)- Checkout");
                System.out.println(" (0)- Cancel Order"); // return back to home screen


                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("1")) {
                    SandwichScreen.sandwichScreen();
                }
                else if (selection.equalsIgnoreCase("2")) {
                    DrinkScreen.drinkScreen();
                }
                else if (selection.equalsIgnoreCase("3")) {
                    System.out.println("Thank you for shopping at DELI-cious! :D");
                    return;
                }
                else if (selection.equalsIgnoreCase("4")) {
                    System.out.println("Thank you for shopping at DELI-cious! :D");
                    return;
                }
                else if (selection.equalsIgnoreCase("0")) {
                    System.out.println("Thank you for shopping at DELI-cious! :D");
                    return;
                } else {
                    System.out.println("Invalid Command");
                }
            } catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }
    }
}
