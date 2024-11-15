package com.pluralsight.Screens;
import com.pluralsight.Order.*;
import com.pluralsight.util.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CheckoutScreen {
    public static void checkoutScreen() {

            try {
                OrderScreen.displayCurrentItems();

                boolean confirmed = Console.PromptForYesNo("Confirm or Cancel?");
                if(!confirmed){
                    OrderScreen.items.clear();
                    HomeScreen.homeScreen();


                }else{
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
                    String filename = "Receipts/" + (LocalDateTime.now().format(formatter) ) + ".txt";
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename ))) {
                        for (MenuItem item: OrderScreen.items){
                            bw.write(item.toString() + "\n");

                        }
                        bw.write("------------------------");
                        bw.write(String.format("\nTotal: $%.2f", OrderScreen.getTotalPrice()));
                        bw.close();
                        HomeScreen.homeScreen();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Command");
            }
        }
    }

