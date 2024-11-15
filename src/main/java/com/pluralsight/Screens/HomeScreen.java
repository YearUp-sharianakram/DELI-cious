package com.pluralsight.Screens;

import com.pluralsight.Order.*;
import com.pluralsight.util.*;

public class HomeScreen {
    public static void homeScreen() {
        while (true) {
            try {
                System.out.println("\nWelcome to DELI-cious");
                System.out.println("How may we help you today?");
                System.out.println(" (N)- New Order");
                System.out.println(" (X)- Exit");

                String selection = Console.PromptForString("Option: ");

                if (selection.equalsIgnoreCase("N")) {
                    OrderScreen.orderScreen();
                    break;
                } else if (selection.equalsIgnoreCase("X")) {
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
