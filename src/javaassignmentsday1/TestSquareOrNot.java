package javaassignmentsday1;

import java.util.Scanner;

public class TestSquareOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");

        double l = sc.nextDouble();

        System.out.println("Enter the breadth: ");

        double b = sc.nextDouble();

        if (l == b)

            System.out.println("Square...");

        else

            System.out.println("Not a Square...");

    }

}

