package javaassignmentsday1;

import java.util.Scanner;

public class MaxOFTwoNumbers {
    public static void main(String[] args) {
        int x, y, g;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");

        x = scanner.nextInt();

        System.out.println("Enter second number : ");

        y = scanner.nextInt();

        g = Math.max(x, y);

        System.out.println("Greatest  number : " + g);
    }
}
