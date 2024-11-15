
# DELI-cious (Custom Sandwich Shop)

This project is the point-of-sale CLI application for DELI-cious, a custom shop. Designed to automate and streamline the order process, the app allows customers to create their perfect sandwich by choosing from various bread types, sandwich sizes, meats, cheeses, toppings, sauces, and sides. Previously, orders were managed on paper, but with DELI-cious expanding, this app provides an efficient solution to handle increased demand, reduce errors, and improve order accuracy. Future plans include enhancing this system to offer online ordering capabilities. The order flow lets employees guide customers through each customization option for a smooth experience.

## Authors

- [@sharianakram](https://www.github.com/sharianakram)


## Screenshots

![Screenshot1](https://github.com/YearUp-sharianakram/DELI-cious/blob/main/ScreenshotsCS2/Screenshot1.png)

From the Home Screen, the user is about to decide whether they want to start an order or exit the application. If "N" is selected, it will bring them to the main menu option where they have the option to add a Sandwich, drink, or chips. They will also have the option to view their current cart and checkout their order. Canceling Order will bring them back to the HomeScreen. 

![Screenshot2](https://github.com/YearUp-sharianakram/DELI-cious/blob/main/ScreenshotsCS2/Screenshot2.png)

If the user decides to add a sandwich, they will be brought to the customize sandwich menu where they choose their bread type, whether they would like it toasted, and the size of the Sandwich. There is an option to return back to the previous question in order to edit responses. After size of sandwich is selected, the user will input the toppings they would like. Starting with meats, then cheese, regulars, sauce, and finally sides. The user has the option to move back and forth in case they forgot to add any toppings. After the sides topping, the user will have to confirm their sandwich before it gets added to their order. 

![Screenshot3](https://github.com/YearUp-sharianakram/DELI-cious/blob/main/ScreenshotsCS2/Screenshot3.png)

When the user is done adding items to their order and ready to check out, they will do so from the order screen. After selecting "5", their current Cart will be displayed with the total and will be given the option to confirm or cancel the entire order and head back to the Home Screen. If the user confirms, a receipt will be created and saved to the directory called "Receipts" with the filename as the current Local Date Time formatted as "yyyyMMdd-hhmmss".

## New Feature - remove toppings

A new feature has been added! You are now able to remove toppings that you have added accidentally or changed your mind about. No need to restart from the beginning for customizing sandwiches. On the confirm page, there is now an option to remove toppings from your sandwich.

![Screenshot4]()

## Interesting Piece of Code

The most interesting piece of code was how I was able to implement the forward and backward screens for the toppings. I started with the current department as "meat" since that was the first topping to add. Then changing that variable to "cheese", stopped the while loop for the meat topping and started a different while loop for the cheese toppings. There is even an option to go back to meat. There is forward and backword compatability from choosing the bread type to confirming if the sandwich should be added to the order.This allows flexibility for the user to make mistakes and correct them instead of having to restart from the beginning. 

