package javaassignmentsday1;

import java.util.Scanner;

public class GetQuantityAndCalculateCost {
    // A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
    // Ask user for quantity.Suppose, one unit will cost 100.
    // Judge and print total cost for user.

    public static void main(String[] args) {
        int quantity, totalCost;
        int oneUnitCost = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity : ");
        quantity = scanner.nextInt();
        totalCost = quantity * oneUnitCost;
        if (totalCost > 1000) {
            System.out.println("Your total cost of purchase is " + totalCost + ". You are eligible for 10% discount");
        } else {
            System.out.println("Your total cost of purchase is " + totalCost + ". You are not eligible for 10% discount");
        }

    }
}
