
package com.mycompany.runapplication;

import java.util.Scanner;
public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println(" 1) PS5");
        System.out.println(" 2) XBOX");
        System.out.println(" 3) SWITCH");
        System.out.println("");

        int choice = input.nextInt();
        input.nextLine();       

        String consoleType;
// Entering console choice
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid console choice.");
                input.close();
                return;
        }
// Enter your stores name
        System.out.print("Enter the store: ");
        String store = input.nextLine();
        
// Enter the total amount of sales your store made
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ":");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);

        sales.printReport();

        input.close();
    }
}
    

