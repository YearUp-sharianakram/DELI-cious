package com.pluralsight.Screens;

import com.pluralsight.util.Console;

public class HomeScreen {
    public static void homeScreen() {
        while (true) {
            try {
                System.out.println("\nWelcome to DELI-cious");
                System.out.println("How may we help you today?");
                System.out.println(" (N)- New Order");
                System.out.println(" (X)- Exit");

                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("N")) {
                    System.out.println("go to sandwich screen");
                } else if (selection.equalsIgnoreCase("X")) {
                    System.out.println("Thank you for using the Accounting Ledger App! :D");
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
