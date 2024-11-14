package com.pluralsight.Screens;

import com.pluralsight.Order.*;
import com.pluralsight.util.*;

import java.util.HashMap;

public class SandwichScreen {
    public static void sandwichScreen() {
        String breadName = "";
        String size = "";
        System.out.println("\nCreating Sandich");
        Sandwich theSandwich = null;
        HashMap<String, Topping> toppings = new HashMap<>();
        boolean toasted = false;
        while (true) {
            try {
                while (breadName.isEmpty()) {
                    System.out.println("\nWhat bread would you like?");
                    for (int i = 0; i < Sandwich.typesOfBread.length; i++) {

                        System.out.println(" (" + (i + 1) + ") " + Sandwich.typesOfBread[i]);

                    }
                    System.out.println(" (X) - Return back to Order Screen");
                    String selection = Console.PromptForString("Option: ");

                    if (selection.equalsIgnoreCase("X")) {
                        OrderScreen.orderScreen();
                        break;
                    } else {
                        int choice = Integer.parseInt(selection);
                        if (choice > Sandwich.typesOfBread.length) {
                            System.out.println("Invalid Command");
                        } else {
                            breadName = Sandwich.typesOfBread[choice - 1];
                            System.out.println("Getting " + breadName);

                        }
                    }
                    toasted = Console.PromptForYesNo("Toasted?");

                }

                while (size.isEmpty()) {
                    System.out.println("Please choose one of the following  size options:");
                    System.out.println(" (S) - Small 4 inch");
                    System.out.println(" (M) - Medium 8 inch");
                    System.out.println(" (L) - Medium 12 inch");
                    System.out.println(" (B) - Return back to Bread Selection Screen");

                    String option = Console.PromptForString("Option: ");
                    if (option.equalsIgnoreCase("B")) {
                        breadName = "";
                        break;
                    } else if (option.equalsIgnoreCase("S") || option.equalsIgnoreCase("small")) {
                        size = "Small";
                        theSandwich = new Sandwich("Small" , breadName, toasted);
                        toppings = theSandwich.getToppings();
                        break;
                    } else if (option.equalsIgnoreCase("M") || option.equalsIgnoreCase("medium")) {
                        size = "Medium";
                        theSandwich = new Sandwich("Small" , breadName, toasted);
                        toppings = theSandwich.getToppings();
                        break;
                    } else if (option.equalsIgnoreCase("L") || option.equalsIgnoreCase("Large")) {
                        size = "Large";
                        theSandwich = new Sandwich("Small" , breadName, toasted);
                        toppings = theSandwich.getToppings();
                        break;
                    } else {
                        System.out.println("Invalid Command");
                    }
                }

                boolean confirmation = false;
                String currentDepartment = "meat";
                while (!size.isEmpty()) {

                    while (currentDepartment.equals("meat")) {
                        System.out.println("\nWhat meats would you like?");
                        for (int i = 0; i < Topping.meats.length; i++) {
                            System.out.println(" (" + (i + 1) + ") " + Topping.meats[i]);
                        }
                        System.out.println(" (B) - Return back to size selection");
                        System.out.println(" (C) - Continue to cheese selection");

                        String selection = Console.PromptForString();

                        if (selection.equalsIgnoreCase("B")) {
                            size = "";
                            break;
                        } else if (selection.equalsIgnoreCase("C")) {
                            currentDepartment = "cheese";
                            break;
                        } else {
                            int choice = Integer.parseInt(selection);
                            if (choice > Topping.meats.length) {
                                System.out.println("Invalid Command");
                            } else {
                                String meatName = Topping.meats[choice - 1];
                                if (!toppings.containsKey(meatName)) {
                                    Topping currentTopping = Topping.createMeat(meatName);
                                    toppings.put(meatName, currentTopping);
                                    theSandwich.setContainsMeat(true);
                                } else {
                                    Topping currentTopping = toppings.get(meatName);
                                    currentTopping.addQuantity();
                                }

                            }
                        }
                    }

                    while (currentDepartment.equals("cheese")) {
                        System.out.println("\nWhat cheese would you like?");
                        for (int i = 0; i < Topping.cheeses.length; i++) {
                            System.out.println(" (" + (i + 1) + ") " + Topping.cheeses[i]);
                        }
                        System.out.println(" (B) - Return back to meat selection");
                        System.out.println(" (C) - Continue to regulars selection");

                        String selection = Console.PromptForString();

                        if (selection.equalsIgnoreCase("B")) {
                            currentDepartment = "meat";
                            break;
                        } else if (selection.equalsIgnoreCase("C")) {
                            currentDepartment = "regulars";
                            break;
                        } else {
                            int choice = Integer.parseInt(selection);
                            if (choice > Topping.cheeses.length) {
                                System.out.println("Invalid Command");
                            } else {
                                String cheeseName = Topping.cheeses[choice - 1];
                                if (!toppings.containsKey(cheeseName)) {
                                    Topping currentTopping = Topping.createCheese(cheeseName);
                                    toppings.put(cheeseName, currentTopping);
                                    theSandwich.setContainsCheese(true);
                                } else {
                                    Topping currentTopping = toppings.get(cheeseName);
                                    currentTopping.addQuantity();
                                }

                            }
                        }
                    }

                    while (currentDepartment.equals("regulars")) {
                        System.out.println("\nWhat regulars would you like?");
                        for (int i = 0; i < Topping.regulars.length; i++) {
                            System.out.println(" (" + (i + 1) + ") " + Topping.regulars[i]);
                        }
                        System.out.println(" (B) - Return back to size selection");
                        System.out.println(" (C) - Continue to sauces selection");

                        String selection = Console.PromptForString();

                        if (selection.equalsIgnoreCase("B")) {
                            currentDepartment = "cheese";
                            break;
                        } else if (selection.equalsIgnoreCase("C")) {
                            currentDepartment = "sauces";
                            break;
                        } else {
                            int choice = Integer.parseInt(selection);
                            if (choice > Topping.regulars.length) {
                                System.out.println("Invalid Command");
                            } else {
                                String regularName = Topping.regulars[choice - 1];
                                if (!toppings.containsKey(regularName)) {
                                    Topping currentTopping = Topping.createRegular(regularName);
                                    toppings.put(regularName, currentTopping);
                                } else {
                                    Topping currentTopping = toppings.get(regularName);
                                    currentTopping.addQuantity();
                                }

                            }
                        }
                    }

                    while (currentDepartment.equals("sauces")) {
                        System.out.println("\nWhat sauces would you like?");
                        for (int i = 0; i < Topping.sauces.length; i++) {
                            System.out.println(" (" + (i + 1) + ") " + Topping.sauces[i]);
                        }
                        System.out.println(" (B) - Return back to regulars selection");
                        System.out.println(" (C) - Continue to sides selection");

                        String selection = Console.PromptForString();

                        if (selection.equalsIgnoreCase("B")) {
                            currentDepartment = "regulars";
                            break;
                        } else if (selection.equalsIgnoreCase("C")) {
                            currentDepartment = "sides";
                            break;
                        } else {
                            int choice = Integer.parseInt(selection);
                            if (choice > Topping.sauces.length) {
                                System.out.println("Invalid Command");
                            } else {
                                String saucesName = Topping.sauces[choice - 1];
                                if (!toppings.containsKey(saucesName)) {
                                    Topping currentTopping = Topping.createSauce(saucesName);
                                    toppings.put(saucesName, currentTopping);
                                } else {
                                    Topping currentTopping = toppings.get(saucesName);
                                    currentTopping.addQuantity();
                                }

                            }
                        }
                    }

                    while (currentDepartment.equals("sides")) {
                        System.out.println("\nWhat sides would you like?");
                        for (int i = 0; i < Topping.sides.length; i++) {
                            System.out.println(" (" + (i + 1) + ") " + Topping.sides[i]);
                        }
                        System.out.println(" (B) - Return back to sauces selection");
                        System.out.println(" (C) - Confirm Sandwich");

                        String selection = Console.PromptForString();

                        if (selection.equalsIgnoreCase("B")) {
                            currentDepartment = "sauces";
                            break;
                        } else if (selection.equalsIgnoreCase("C")) {
                            currentDepartment = "";
                            confirmation = confirmSandwich(theSandwich);

                        } else {
                            int choice = Integer.parseInt(selection);
                            if (choice > Topping.sides.length) {
                                System.out.println("Invalid Command");
                            } else {
                                String sideName = Topping.sides[choice - 1];
                                if (!toppings.containsKey(sideName)) {
                                    Topping currentTopping = Topping.createSide(sideName);
                                    toppings.put(sideName, currentTopping);
                                } else {
                                    Topping currentTopping = toppings.get(sideName);
                                    currentTopping.addQuantity();
                                }

                            }
                        }
                        if (confirmation){
                            OrderScreen.items.add(theSandwich);
                            breadName = "";
                            size = "";
                        }
                    }
                }

            }catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }


        }
    public static boolean confirmSandwich(Sandwich sandwich){
        System.out.println(sandwich);
        return Console.PromptForYesNo("Confirm Order");

    }
}
