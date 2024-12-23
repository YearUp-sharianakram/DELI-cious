package com.pluralsight.util;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String PromptForString() {
        return scanner.nextLine();
    }



    public static boolean PromptForYesNo(String prompt) {

        while(true) {
            System.out.print(prompt + " ( Y for Yes, N for No ) ?");
            String userinput = scanner.nextLine();

            if (userinput.equalsIgnoreCase("Y") || userinput.equalsIgnoreCase("YES")){
                return true;
            }else if (userinput.equalsIgnoreCase("N") || userinput.equalsIgnoreCase("NO")){
                return false;
            }else{
                System.out.println("Invalid Command");
            }
        }
    }

    public static int PromptForInt(String prompt) {
        System.out.println(prompt);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static short PromptForShort(String prompt) {
        System.out.print(prompt);
        short userinput = scanner.nextShort();
        scanner.nextLine();
        return userinput;
    }

    public static byte PromptForByte(String prompt) {
        System.out.print(prompt);
        byte userinput = scanner.nextByte();
        return userinput;
    }

    public static double PromptForDouble(String prompt) {
        System.out.print(prompt);
        double userinput = scanner.nextDouble();
        scanner.nextLine();
        return userinput;
    }


}