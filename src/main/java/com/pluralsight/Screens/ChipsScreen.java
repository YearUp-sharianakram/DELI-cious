package com.pluralsight.Screens;
import com.pluralsight.Order.*;
import com.pluralsight.util.*;


public class ChipsScreen {

    public static void chipsScreen() {
        while (true) {
            try {
                System.out.println("\nPlease choose one of the follow chip flavor options:");
                for (int i = 0; i < (Chips.chipFlavors.length); i++ ){
                    System.out.println(" (" + (i+1) + ") " + Chips.chipFlavors[i]);
                }
                System.out.println(" (X) - Return back to Order Screen");

                String selection = Console.PromptForString();

                if (selection.equalsIgnoreCase("X")) {
                    break;
                }
                else{
                    int choice = Integer.parseInt(selection);
                    if (choice > Chips.chipFlavors.length){
                        System.out.println("Invalid Command");
                    }else{
                        String chipsName = Chips.chipFlavors[choice - 1];
                        Chips makeChips = new Chips(chipsName);
                        OrderScreen.items.add(makeChips);
                        System.out.println("Successfully added chips!!!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }
    }
}
