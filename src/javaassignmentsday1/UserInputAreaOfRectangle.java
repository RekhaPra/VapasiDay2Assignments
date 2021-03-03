package javaassignmentsday1;

import java.util.Scanner;

public class UserInputAreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of Rectangle : ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of Rectangle : ");
        double height = scanner.nextDouble();
        scanner.close();
        double area = width * height;
        System.out.println("Area of the rectangle is: "+ (int)area);
    }
}
